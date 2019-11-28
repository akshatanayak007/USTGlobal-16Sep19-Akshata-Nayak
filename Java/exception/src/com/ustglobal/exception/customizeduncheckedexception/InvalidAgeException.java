package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	
	String message = "Invalid Age. Below 18 years not allowed";
	
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	
}
