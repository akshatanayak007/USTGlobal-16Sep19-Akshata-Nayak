package com.ustglobal.springboot.dto;

import java.util.List;

public class EmployeeResponse {
	
	private int StatusCode;
	private String message;
	private String description;
	private List<EmployeeBean> employeeBeans;
	
	public List<EmployeeBean> getEmployeeBeans() {
		return employeeBeans;
	}
	public void setEmployeeBeans(List<EmployeeBean> employeeBeans) {
		this.employeeBeans = employeeBeans;
	}
	public int getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
