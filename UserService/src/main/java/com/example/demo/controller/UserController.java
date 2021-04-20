package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.UserResponse;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public UserEntity savaUser(@RequestBody UserEntity userEntity) {
		return userService.saveUser(userEntity);
	}
	
	@GetMapping("/getUser/{userId}")
	public UserResponse getUserWithDepartment(@PathVariable("userId") Long userId ) {
		return userService.findUserById(userId);
	}
}
