package com.dept.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dept.dao.DepartmentRepository;
import com.dept.entity.Department;
import com.dept.service.DepartemntService;

@Component
public class DepartmentServiceImpl implements DepartemntService {

	@Autowired
	private DepartmentRepository deptRepository;

	@Override
	public Department saveDepartment(Department department) {
		Department save = deptRepository.save(department);
		System.out.println("save..... " + save);
		return save;
	}

	@Override
	public Department getDepartmentById(Long deptid) {
		Department depid = deptRepository.findById(deptid).get();
		return depid;
	}

}
