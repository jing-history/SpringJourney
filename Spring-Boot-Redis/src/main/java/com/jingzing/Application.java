package com.jingzing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring-Boot
 * Created by Louis Wang on 2016/4/8.
 */

/*@RestController
@EnableAutoConfiguration*/
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
