package com.akash.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    private String departmentName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentID;
    private String departmentAddress;
    private String departmentCode;

    public Department(String departmentName, Long departmentID, String departmentAddress, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
