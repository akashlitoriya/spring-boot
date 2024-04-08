package com.springframeworkdemo.demo;

import org.springframework.stereotype.Component;

@Component
public class Patient {
    public void role(){
        System.out.println("Patient is getting treated by the Doctor and the nurse");
    }
}
