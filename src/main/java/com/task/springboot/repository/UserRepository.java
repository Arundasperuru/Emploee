package com.task.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.springboot.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findByUserName(String userName);

}
