package com.springframeworkdemo.demo;

public class Doctor implements Staff {
    private String qualification;
    private Nurse nur;

    public void assist(){
        System.out.println("Doctor Assists the patient");
    }

    public void setQualification(String value){
        this.qualification = value;
    }
    public String getQualification(){
        return qualification;
    }

    public void setNur(Nurse value){
        this.nur = value;

    }
    public Nurse getNur(){
        return nur;
    }
}
