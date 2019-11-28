package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {

	public static void main(String[] args) {

		System.out.println("Main Started");
		
		Validator v = new Validator();
		try {
		v.verify(16);
		}
		catch(InvalidAgeException ie) {
			ie.printStackTrace();
			System.out.println("Exception Occured");
		}
		
		System.out.println("Main Ended");
	}

}
