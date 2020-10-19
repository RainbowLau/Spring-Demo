package cn.cloud.eurekaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSpringbootApplication.class, args);
    }

}
