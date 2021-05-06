package com.task.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.springboot.entity.EducationEntity;

@Repository
public interface EducationInterface extends JpaRepository<EducationEntity, Integer> {

}
