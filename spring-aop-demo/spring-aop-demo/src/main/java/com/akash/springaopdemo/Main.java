package com.akash.springaopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("Hello, World!");
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.checkout();
    }
}
