package com.quick.sample.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydemoApplication.class, args);
    }



    @RequestMapping("/")
    String index() {
        String str=(int)Math.floor(Math.random()*44444)+"";
        return "Random number is : " +str;
    }


    @RequestMapping("/hello")
    String hello() {

        return "Hello : ";
    }

}
