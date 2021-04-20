package com.example.demo.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service

public class DepartmentService {
	
	private Logger log;
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
		
	}

	public Department findDepartment(Long departmentId) {
	
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
