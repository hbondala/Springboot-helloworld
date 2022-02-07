package com.java.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

    @GetMapping("/hello")
    public String greet(){
        return "Hello world, this is springboot project";
    }
}