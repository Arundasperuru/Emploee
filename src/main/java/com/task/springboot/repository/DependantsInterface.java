package com.task.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.springboot.entity.DependantsEntity;

@Repository
public interface DependantsInterface extends JpaRepository<DependantsEntity, Integer> {

}
