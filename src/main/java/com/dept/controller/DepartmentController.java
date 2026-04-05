package com.dept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dept.entity.Department;
import com.dept.service.DepartemntService;


@RestController
@RequestMapping("Dept/Api")
public class DepartmentController {
	
	@Autowired
	private DepartemntService deptService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
		
		   Department savedDepartment = deptService.saveDepartment(department);
               
		   
		   System.out.println("department"+department);
	        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Department> getUser(@PathVariable("id") Long userId){
		System.out.println("Hell Document.............");
		
		  Department responseDto = deptService.getDepartmentById(userId);
        return ResponseEntity.ok(responseDto);
    }

	@RequestMapping(value="user/{id}", method=RequestMethod.GET)
	public String getUserById(@PathVariable("id") Long userId){
		System.out.println("Hellow Document.............");

		return "Welcome to Docker world......";
	}

}
