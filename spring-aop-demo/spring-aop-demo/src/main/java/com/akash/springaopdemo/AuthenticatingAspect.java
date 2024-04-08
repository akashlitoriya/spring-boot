package com.akash.springaopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticatingAspect {
    @Pointcut("within(com..*)")
    public void authenticationPointCut(){

    }
    @Pointcut("within(com..*)")
    public void authorizationPointCut(){

    }

    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the user...");
    }
}
