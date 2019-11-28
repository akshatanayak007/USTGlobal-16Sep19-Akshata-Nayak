package com.ustglobal.typecasting.primitive;

public class TestA {

	public static void main(String[] args) {
		
		byte a = 10;
		int b =a;
		System.out.println("b is "+b);
		int p = 20;                      //
		double q = p; //implicit casting
		
		double v =78.67;
		byte c =(byte) v;       //explicit casting 
		char n = (char)c;
		System.out.println("c is "+c);
		System.out.println("n is "+n);
		System.out.println("q is "+q);

	}

}
