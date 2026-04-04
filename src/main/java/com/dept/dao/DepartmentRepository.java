package com.dept.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.dept.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
