package site.dunhanson.pms.api;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class SecurityTests {
    @Resource
    private PasswordEncoder passwordEncoder;

    @Test
    public void testPassword() {
        System.out.println(passwordEncoder.encode("123456"));
    }

}
