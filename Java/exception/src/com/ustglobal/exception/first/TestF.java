package com.ustglobal.exception.first;

public class TestF {

	public static void main(String[] args) {
		System.out.println("Main Started");

		String s = "hello";
		int [] a = {10,20,30};
		int b = 10;

		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[20]);
			System.out.println(b/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Divide by Zero");     
		}
		catch(Exception e) {
			e.printStackTrace();	//or
			System.out.println("Exception occured :-"+e);
		}
//		catch(ArithmeticException ae) {
//			System.out.println("Divide by Zero");      we cannot handle exception after writing general try-catch block
//		}

		System.out.println("Main Ended");
	}


}
