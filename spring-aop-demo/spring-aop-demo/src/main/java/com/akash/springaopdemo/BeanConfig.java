package com.akash.springaopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.akash.springaopdemo")
@EnableAspectJAutoProxy
public class BeanConfig {
}
