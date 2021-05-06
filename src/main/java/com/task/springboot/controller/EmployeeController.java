package com.task.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.springboot.dto.EmpData;
import com.task.springboot.dto.Response;
import com.task.springboot.entity.EmployeeEntity;
import com.task.springboot.service.EmployeeService;

@RestController
@RequestMapping("employeeDetails")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployeeDetail")
	public Response addEmployee(@RequestBody EmpData empDTO) {
		return employeeService.saveEmployeeDetail(empDTO);
	}

//	@PostMapping("/addEmployeeDetails")
//	public List<EmployeeEntity> addEmployees(@RequestBody List<EmployeeEntity> empEntities) {
//		return employeeService.saveEmployeeDetails(empEntities);
//	}

	@GetMapping("/getEmployeeDetails")
	public List<EmployeeEntity> getAllEmployees() {
		return employeeService.getAll();
	}

	@GetMapping("/getEmployeeDetailsById/{id}")
	public EmployeeEntity getEmployeeDetailsById(@PathVariable Integer id) {
		return employeeService.getById(id);
	}

	@GetMapping("/getEmployeeDetailsByEmployeeId/{employeeId}")
	public EmployeeEntity getEmployeeDetailsByEmployeeId(@PathVariable Integer employeeId) {
		return employeeService.getByEmployeeId(employeeId);
	}

	@PutMapping("/updateEmployeeDetails")
	public Response updateEmployeeDetails(@RequestBody EmpData empData) {
		return employeeService.updateDetails(empData);
	}

	@DeleteMapping("/deleteEmployeeDetail/{id}")
	public String deleteEmployeeDetail(@PathVariable Integer id) {
		return employeeService.deleteById(id);
	}
}
