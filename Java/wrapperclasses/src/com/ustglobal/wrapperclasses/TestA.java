package com.ustglobal.wrapperclasses;

public class TestA {
	
	protected class TestB{		//Nested class
		
	}

	public static void main(String[] args) {
		class Test{			//Inner classes
			
		}
		int a = 10;
		System.out.println("a is "+a);
		
		Integer i =a;							//Auto-boxing :- converting primitive data type to non primitive data type
		System.out.println("i is "+i);
		
		Integer x =10;
		System.out.println("x is "+x);
		
		int y = x;									//Un-boxing auto-boxing
		System.out.println("y is "+y);
		
		int value = Integer.parseInt("123");
		System.out.println("Value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is "+result);
	}

}
