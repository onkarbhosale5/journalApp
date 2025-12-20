package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @ParameterizedTest
    @Disabled
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testFindByUserName(User user){
        assertTrue(userService.saveNewUser(user));
    }

    @ParameterizedTest
    @Disabled
    @CsvSource({
            "10,5,5",
            "7,3,4",
            "11,3,5"
    })
    public void test(int expected, int a, int b){
        assertEquals(expected,a+b,"failed for "+expected+" = "+a+" + "+b);
    }

    @ParameterizedTest
    @Disabled
    @ValueSource(ints = {
            10,1
    })
    public void test1(int provided){
        assertTrue(5>provided);
    }
}
