package com.akash.springaopdemo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        System.out.println("Checking out the cart...");
    }
}
