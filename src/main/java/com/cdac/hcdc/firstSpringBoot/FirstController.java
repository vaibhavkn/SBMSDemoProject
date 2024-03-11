package com.cdac.hcdc.firstSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Just Testing....");
        return "Hello World";
    }
}
