package com.ustglobal.lambdaexpressions;

public class TestAdd  implements AddInterface{

	public static void main(String[] args) {
		TestAdd t = new TestAdd();
		int a = t.add(10,20);
		System.out.println("The Sum of two number is "+a);
	}
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
