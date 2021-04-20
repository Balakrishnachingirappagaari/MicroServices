package com.example.demo.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveDepartments")
	public Department saveDepartment(@RequestBody Department department) {
		
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/findDepartment/{departmentId}")
	public Department findDepartment(@PathVariable("departmentId") Long departmentId) {
		return departmentService.findDepartment(departmentId);
	}
}
