package com.dept.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dept.entity.Department;

@Component
public interface DepartemntService {
	
    Department saveDepartment(Department department);

  Department getDepartmentById(Long departmentId);

}
