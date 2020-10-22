package cn.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class ImageDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageDemoApplication.class, args);
    }

}
