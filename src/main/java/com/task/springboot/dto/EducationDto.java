package com.task.springboot.dto;

import java.sql.Date;

public class EducationDto {
	private int id;
	private int employementId;
	private String EducationType;
	private Date StartDate;
	private Date EndDate;
	private String Type;
	private String Institution;
	private String Address;
	private Float Percentage;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployementId() {
		return employementId;
	}
	public void setEmployementId(int employementId) {
		this.employementId = employementId;
	}
	public String getEducationType() {
		return EducationType;
	}
	public void setEducationType(String educationType) {
		EducationType = educationType;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getInstitution() {
		return Institution;
	}
	public void setInstitution(String institution) {
		Institution = institution;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Float getPercentage() {
		return Percentage;
	}
	public void setPercentage(Float percentage) {
		Percentage = percentage;
	}

}
