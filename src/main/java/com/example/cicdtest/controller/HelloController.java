package com.example.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello333333333";
    }

    @GetMapping("/")
    public String test(){
        return "testDDD";
    }
}
