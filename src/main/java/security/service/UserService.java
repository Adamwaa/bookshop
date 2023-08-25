package security.service;


import security.dto.UserDTO;
import security.model.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDTO userDto);

    List<UserDTO> findAllUsers();

    User findUserByEmail(String email);

}
