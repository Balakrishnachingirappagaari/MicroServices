package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.Department;
import com.example.demo.domain.UserResponse;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTempate;

	public UserEntity saveUser(UserEntity userEntity) {

		return userRepository.save(userEntity);
	}

	public UserResponse findUserById(Long userId) {
		UserResponse ur=new UserResponse();
		
		UserEntity ue=userRepository.findByUserId(userId);		
		Department department=restTempate.getForObject("http://MCART-SERVICE/departments/findDepartment/"+ue.getUserId(), Department.class);
		ur.setUserEntity(ue);
		ur.setDepartment(department);
		return ur;
		
	}
}
