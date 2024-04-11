package com.akash.springboot.service;

import com.akash.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department createDep(Department dept);
    public List<Department> getDepartments();
    public Department getDepartmentById(Long id);
    public Department updateDepartmentById(Long id, Department dept);
    public String deleteDepartmentById(Long id);
}
