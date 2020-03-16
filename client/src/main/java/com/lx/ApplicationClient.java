package com.lx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient

@RestController
public class ApplicationClient {
    public static void main(String[]args){
        SpringApplication.run(ApplicationClient.class,args);
    }
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(String name) {
        return "hi " + name + " , l am " + port + " port";
    }
}
