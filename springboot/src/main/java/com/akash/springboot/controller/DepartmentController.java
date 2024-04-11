package com.akash.springboot.controller;

import com.akash.springboot.entity.Department;
import com.akash.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/createDepartment")
    public Department createDep(@RequestBody Department dept){
        return departmentService.createDep(dept);
    }

    @GetMapping("/getDepartments")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    @GetMapping("/getDepartment/id/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }

    @PutMapping("/updateDepartment/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long id, @RequestBody Department dept){
        return departmentService.updateDepartmentById(id, dept);
    }

    @DeleteMapping("/delete/id/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
        return departmentService.deleteDepartmentById(id);
    }
}
