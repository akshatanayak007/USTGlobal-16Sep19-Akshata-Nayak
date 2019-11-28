package com.ustglobal.exception.first;

public class TestG {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		PayTm p = new PayTm();
		try {
		p.book();
		}
		catch(ArithmeticException ae) {
			System.out.println("Booking Failed");
		}
		finally {
			System.out.println("Executing Finally");
		}
		
		System.out.println("Main Ended");
	}

}
