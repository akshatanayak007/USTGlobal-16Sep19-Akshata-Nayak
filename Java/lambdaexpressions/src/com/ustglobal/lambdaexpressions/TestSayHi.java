package com.ustglobal.lambdaexpressions;

public class TestSayHi {

	public static void main(String[] args) {

		SayHiInterface s = ()->System.out.println("Hii");
		s.sayHi();
		
	}

}
