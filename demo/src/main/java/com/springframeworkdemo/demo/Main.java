package com.springframeworkdemo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //this is how we create beans factory
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
        // Doctor doc = new Doctor();
        // //accessing the bean
        // Doctor doc1 = context.getBean(Doctor.class);
        // doc.assist();
        // doc1.assist();
        // //accessing the using the id of the bean
        // Nurse nur = (Nurse)context.getBean("nurse");
        // nur.assist();

        // Staff stff = context.getBean(Doctor.class);
        // stff.assist();
        
        // Doctor d1 = context.getBean(Doctor.class);
        // System.out.println(d1.getQualification());

        // Doctor d2 = context.getBean(Doctor.class);
        // System.out.println(d2.getNur());

        //Access the object injected using the annotations
        Patient p = context.getBean(Patient.class);
        p.role();
    }    
}
