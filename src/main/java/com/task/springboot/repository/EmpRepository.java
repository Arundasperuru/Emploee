package com.task.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.springboot.entity.EmployeeEntity;

@Repository
public interface EmpRepository extends JpaRepository<EmployeeEntity, Integer> {

}
