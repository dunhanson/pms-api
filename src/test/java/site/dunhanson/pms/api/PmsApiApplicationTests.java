package site.dunhanson.pms.api;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.dunhanson.pms.api.module.permission.service.SysUserService;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class PmsApiApplicationTests {
    @Resource
    private SysUserService sysUserService;

    @Test
    void contextLoads() {
        log.info("count:{}", sysUserService.count());
    }

}
