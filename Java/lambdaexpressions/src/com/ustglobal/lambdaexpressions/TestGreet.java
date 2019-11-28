package com.ustglobal.lambdaexpressions;

public class TestGreet {

	public static void main(String[] args) {
			
		Greetings gr = (message)->{
			
		System.out.println("Hello");
		System.out.println(message);
		};
		gr.greet("Karnataka");
		
	}

}
