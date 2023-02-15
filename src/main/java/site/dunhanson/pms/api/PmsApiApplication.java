package site.dunhanson.pms.api;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("site.dunhanson.pms.api.module.permission.dao")
@SpringBootApplication
public class PmsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsApiApplication.class, args);
    }

}
