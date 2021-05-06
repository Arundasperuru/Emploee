package com.task.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.springboot.dto.EmpData;
import com.task.springboot.dto.Response;
import com.task.springboot.entity.DependantsEntity;
import com.task.springboot.entity.EducationEntity;
import com.task.springboot.entity.EmployeeEntity;
import com.task.springboot.repository.DependantsInterface;
import com.task.springboot.repository.EducationInterface;
import com.task.springboot.repository.EmpRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private EducationInterface educationRepository;
	
	@Autowired
	private DependantsInterface dependantsRepository;

	public Response saveEmployeeDetail(EmpData empData) {
		try {
			function(empData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Response r = new Response();
		r.setMessage("success");
		return r;
	}

//	public List<EmployeeEntity> saveEmployeeDetails(List<EmployeeEntity> empEntities) {
//		return empRepository.saveAll(empEntities);
//	}

	private void function(EmpData empData) throws Exception {
		if (empData.getFirstName() == null && empData.getEmployementId() == 0 && empData.getLastName() == null
				&& empData.getDOB() == null && empData.getGender() == null) {
			throw new Exception(" Please Enter Valid Details");

		} else {
			EmployeeEntity employeeEntity = new EmployeeEntity();
			employeeEntity.setId(empData.getId());
			employeeEntity.setFirstName(empData.getFirstName());
			employeeEntity.setLastName(empData.getLastName());
			employeeEntity.setEmployementId(empData.getEmployementId());
			employeeEntity.setStartDate(empData.getStartDate());
			employeeEntity.setDesignation(empData.getDesignation());
			employeeEntity.setDepartment(empData.getDepartment());
			employeeEntity.setEndDate(empData.getEndDate());
			employeeEntity.setStatus(empData.getStatus());
			employeeEntity.setDOB(empData.getDOB());
			employeeEntity.setReportingManager(empData.getReportingManager());
			employeeEntity.setGender(empData.getGender());
			employeeEntity.setBloodGroup(empData.getBloodGroup());

			List<EducationEntity> educationDetails = new ArrayList<>();
			List<DependantsEntity> dependantsDetails = new ArrayList<>();

			empData.getEducationDetails().stream().forEach(data -> {
				EducationEntity dto = new EducationEntity();
				dto.setId(data.getId());
				dto.setEmployementId(data.getEmployementId());
				dto.setStartDate(data.getStartDate());
				dto.setEndDate(data.getEndDate());
				dto.setType(data.getType());
				dto.setInstitution(data.getInstitution());
				dto.setAddress(data.getAddress());
				dto.setPercentage(data.getPercentage());
				educationDetails.add(dto);
			});
			empData.getDependantsDetails().stream().forEach(data -> {
				DependantsEntity dto = new DependantsEntity();
				dto.setId(data.getId());
				dto.setEmployementId(data.getEmployeeId());
				dto.setFirstName(data.getFirstName());
				dto.setLastName(data.getLastName());
				dto.setGender(data.getGender());
				dto.setDOB(data.getDOB());
				dto.setRelationship(data.getRelationship());
				dependantsDetails.add(dto);
			});

			employeeEntity.setDependantsEntity(dependantsDetails);
			employeeEntity.setEducationEntity(educationDetails);
			employeeEntity = empRepository.save(employeeEntity);
		}
	}

	public EmployeeEntity getById(Integer id) {
		return empRepository.findById(id).orElseThrow(null);

	}

	public List<EmployeeEntity> getAll() {
		return empRepository.findAll();

	}

	public EmployeeEntity getByEmployeeId(Integer employeeId) {
		return empRepository.findById(employeeId).orElseThrow(null);

	}

	public String deleteById(Integer id) {
		empRepository.deleteById(id);
		return "Employee Deleted" + id;

	}
	
	public Response updateDetails(EmpData empData) {
		updations(empData);
		Response r = new Response();
		r.setMessage("Details Updated Successfully");
		return r;
		
	}
	
	private void updations(EmpData empData) {
		EmployeeEntity existingData = empRepository.findById(empData.getId()).orElse(null);
		EducationEntity existingEducationDetails = educationRepository.findById(empData.getId()).orElse(null);
		DependantsEntity existingDependantsDetails = dependantsRepository.findById(empData.getId()).orElse(null);		
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setId(empData.getId());
		employeeEntity.setFirstName(empData.getFirstName());
		employeeEntity.setLastName(empData.getLastName());
		employeeEntity.setEmployementId(empData.getEmployementId());
		employeeEntity.setStartDate(empData.getStartDate());
		employeeEntity.setDesignation(empData.getDesignation());
		employeeEntity.setDepartment(empData.getDepartment());
		employeeEntity.setEndDate(empData.getEndDate());
		employeeEntity.setStatus(empData.getStatus());
		employeeEntity.setDOB(empData.getDOB());
		employeeEntity.setReportingManager(empData.getReportingManager());
		employeeEntity.setGender(empData.getGender());
		employeeEntity.setBloodGroup(empData.getBloodGroup());

		List<EducationEntity> educationDetails = new ArrayList<>();
		List<DependantsEntity> dependantsDetails = new ArrayList<>();

		empData.getEducationDetails().stream().forEach(data -> {
			EducationEntity dto = new EducationEntity();
			dto.setId(data.getId());
			dto.setEmployementId(data.getEmployementId());
			dto.setStartDate(data.getStartDate());
			dto.setEndDate(data.getEndDate());
			dto.setType(data.getType());
			dto.setInstitution(data.getInstitution());
			dto.setAddress(data.getAddress());
			dto.setPercentage(data.getPercentage());
			educationDetails.add(dto);
		});
		empData.getDependantsDetails().stream().forEach(data -> {
			DependantsEntity dto = new DependantsEntity();
			dto.setId(data.getId());
			dto.setEmployementId(data.getEmployeeId());
			dto.setFirstName(data.getFirstName());
			dto.setLastName(data.getLastName());
			dto.setGender(data.getGender());
			dto.setDOB(data.getDOB());
			dto.setRelationship(data.getRelationship());
			dependantsDetails.add(dto);
		});

		employeeEntity.setDependantsEntity(dependantsDetails);
		employeeEntity.setEducationEntity(educationDetails);
		employeeEntity = empRepository.save(employeeEntity);
	}
}