package site.dunhanson.pms.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("site.dunhanson.pms.api.module.db.dao")
@SpringBootApplication
public class PmsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsApiApplication.class, args);
    }

}
