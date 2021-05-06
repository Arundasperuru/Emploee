package com.task.springboot.dto;

import java.sql.Date;
import java.util.List;

public class EmpData {
	private int id;
	private String FirstName;
	private String LastName;
	private int EmployementId;
	private Date StartDate;
	private String Designation;
	private String Department;
	private Date EndDate;
	private String Status;
	private Date DOB;
	private String ReportingManager;
	private String Gender;
	private String BloodGroup;
	private String Address;
	private List<EducationDto> educationDetails;
	private List<DependantsDTO> dependantsDetails;

	public List<EducationDto> getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(List<EducationDto> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public List<DependantsDTO> getDependantsDetails() {
		return dependantsDetails;
	}

	public void setDependantsDetails(List<DependantsDTO> dependantsDetails) {
		this.dependantsDetails = dependantsDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getEmployementId() {
		return EmployementId;
	}

	public void setEmployementId(int employementId) {
		EmployementId = employementId;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getReportingManager() {
		return ReportingManager;
	}

	public void setReportingManager(String reportingManager) {
		ReportingManager = reportingManager;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
