package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;

@RestControllerAdvice
public class HandlingException {
	
	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Found an Exception");
		return response;
		
	}

}
