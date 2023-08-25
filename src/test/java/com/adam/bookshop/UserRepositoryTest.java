//package com.adam.bookshop;
//
//import com.adam.bookshop.repository.UserBookShopRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@ExtendWith(MockitoExtension.class)
//public class UserRepositoryTest {
//
////    @Autowired
////    private TestEntityManager entityManager;
//
//    @Mock
//    private UserBookShopRepository UserBookShopRepository;
//
//    private CustomUserDetailsService customUserDetailsService;
//
//    @BeforeEach
//    public void setUp() {
//        customUserDetailsService = new CustomUserDetailsService(UserBookShopRepository);
//    }
//
//    public UserRepositoryTest() {
//    }
//
////    @Test
////    public void testCreateUser() {
////
////        UserBookShop user = new UserBookShop();
////        user.setUserName("admin");
////        user.setPassword("1234");
////        user.setRole("admin");
////
////        UserBookShop savedUser = UserBookShopRepository.save(user);
////        UserBookShop existUser = entityManager.find(UserBookShop.class, savedUser.getId());
////        assertThat(user.getUserName()).isEqualTo(existUser.getUserName());
////    }
////
////    @Test
////    public void getUserByNameTest() {
////        UserBookShop userBookShop = new UserBookShop();
////        userBookShop.setUserName("Harry Potter");
////        when(UserBookShopRepository.findUserBookShopByUserName("Harry Potter")).thenReturn(Optional.of(userBookShop));
////
////        UserBookShop getUserName = customUserDetailsService.getUserByName("Harry Potter");
////
////        //assertNotNull(getUserName);  // Add this to ensure getUserName is not null
////
////        assertEquals(userBookShop.getUserName(), getUserName.getUserName());
////        verify(UserBookShopRepository, times(1)).findUserBookShopByUserName("Harry Potter");
////    }
//
//
//
//
//
//
//
//
//
//}
