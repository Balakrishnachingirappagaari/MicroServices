package com.example.demo.domain;

import com.example.demo.entity.UserEntity;

public class UserResponse {

	private UserEntity userEntity;
	
	private Department department;

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public UserResponse(UserEntity userEntity, Department department) {
		super();
		this.userEntity = userEntity;
		this.department = department;
	}

	@Override
	public String toString() {
		return "UserResponse [userEntity=" + userEntity + ", department=" + department + "]";
	}

	public UserResponse() {
		
	}
	
	
}
