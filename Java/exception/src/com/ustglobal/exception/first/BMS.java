package com.ustglobal.exception.first;

public class BMS {
	public static void main(String[] args) {
		
		System.out.println("BMS Started");
		
		PVR p = new PVR();
		try {
			p.book();
			System.out.println("You have successfully booked");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Booking seats in PVR Failed");
		}
		System.out.println("BMS Ended");
	}

}
