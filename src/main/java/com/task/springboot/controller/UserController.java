package com.task.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.springboot.dto.UserDto;
import com.task.springboot.entity.UserEntity;
import com.task.springboot.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/createUser")
	public String createUser(@RequestBody UserDto userDto) {
		return userService.CreateUser(userDto);
	}

	@GetMapping("/getAllUserDetails")
	public List<UserEntity> getAllDetails() {
		return userService.getAllDetails();
	}

	@GetMapping("/getUserDetailsById/{userName}")
	public UserEntity getDetailsByUserName(@PathVariable String userName) {
		return userService.getDetailsByUserName(userName);
	}

}
