package com.akash.springaopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
    @Before("execution(* com.akash.springaopdemo.ShoppingCart.checkout())")
    public void logger(){
        System.out.println("Logging the user...");
    }

    @After("execution(* *.*.*.*.checkout())")
    public void logout(){
        System.out.println("Logging out the user...");
    }
}
