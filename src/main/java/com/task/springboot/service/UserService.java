package com.task.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.springboot.dto.UserDto;
import com.task.springboot.entity.UserEntity;
import com.task.springboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String CreateUser(UserDto userDto) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(userDto.getUserName());
		userEntity.setPassword(userDto.getPassword());
		userRepository.save(userEntity);
		return "User Successfully Created";
	}

	public List<UserEntity> getAllDetails() {
		return userRepository.findAll();
	}
	
	public UserEntity getDetailsByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
