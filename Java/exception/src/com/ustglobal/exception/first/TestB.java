package com.ustglobal.exception.first;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		int a =10;
		
		int b=0;
		
		try {
			 b =10/0;
			 System.out.println(b);
			 System.out.println("Hello");
			 System.out.println("Happy Deepavali");
		}
		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
			ae.printStackTrace();
		}
		
		System.out.println(b);
		
		System.out.println("Main Ended");

	}

}
