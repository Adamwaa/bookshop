package security.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import security.dto.UserDTO;
import security.model.Role;
import security.model.User;
import security.repository.RoleRepository;
import security.repository.UserRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           PasswordEncoder passwordEncoder)
    {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void saveUser(UserDTO userDto) {

        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(user.getEmail());
        user.setPassword(userDto.getPassword());

        Role role = roleRepository.findByName("ROLE_ADMIN");
        if(role == null) {
            role = checkRoleExist();
        }
        user.setRoles(Arrays.asList(role));

        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public List<UserDTO> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> mapToUserDTO(user))
                .collect(Collectors.toList());
    }

    //map User to UserDTO
    private UserDTO mapToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }

    private Role checkRoleExist() {
        Role role = new Role();
        role.setRoleName("ROLE_ADMIN");
        return roleRepository.save(role);
    }


}
