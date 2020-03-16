package com.lx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients

@RestController
public class ApplicationFeign {
    public static void main(String[]args){
        SpringApplication.run(ApplicationFeign.class,args);
    }
    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return helloService.obtainOtherServerJsonData(name);
    }
}
