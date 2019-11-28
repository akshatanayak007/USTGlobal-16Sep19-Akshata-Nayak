package com.ustglobal.exception.first;

public class TestD {

	public static void main(String[] args) {

		System.out.println("Main Started");

		int[] a = {10,20,30};
		int b = 10;

		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array index not present");
		}
		
		
		try {
			System.out.println(b/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Number divide by zero");
		}


		System.out.println("Main Ended");
	}

}
