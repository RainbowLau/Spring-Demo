package cn.emailexception;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.emailexception.mapper")
@SpringBootApplication
public class EmailExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailExceptionApplication.class, args);
    }

}
