package com.akash.springboot.service;

import com.akash.springboot.entity.Department;
import com.akash.springboot.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImple implements DepartmentService{
    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department createDep(Department dept){
        return departmentRepo.save(dept);
    }
    @Override
    public List<Department> getDepartments(){
        return departmentRepo.findAll();
    }
    @Override
    public Department getDepartmentById(Long id){
        return departmentRepo.findById(id).get();
    }
    @Override
    public Department updateDepartmentById(Long id, Department dept){
        Department d = departmentRepo.findById(id).get();
        if(Objects.nonNull(dept.getDepartmentName()) && !"".equalsIgnoreCase(dept.getDepartmentName())){
            d.setDepartmentName(dept.getDepartmentName());
        }
        if(Objects.nonNull(dept.getDepartmentAddress()) && !"".equalsIgnoreCase(dept.getDepartmentAddress())){
            d.setDepartmentAddress(dept.getDepartmentAddress());
        }
        if(Objects.nonNull(dept.getDepartmentCode()) && !"".equalsIgnoreCase(dept.getDepartmentCode())){
            d.setDepartmentCode(dept.getDepartmentCode());
        }
        return departmentRepo.save(d);
    }
    @Override
    public String deleteDepartmentById(Long id){
        departmentRepo.deleteById(id);
        return "Department deleted Successfully";
    }
}
