package com.akash.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/")
    @GetMapping
    public String hello(){
        return "Welcome, to my First Spring-boot Application....";
    }

}
