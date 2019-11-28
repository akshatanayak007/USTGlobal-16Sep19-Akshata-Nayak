package com.ustglobal.exception.first;

public class PayTm {
	void book() {
		System.out.println("PayTM Started");
		
		IRCTC  i = new IRCTC();
	
			i.confirm();
		
		
//			System.out.println("Booking seats in IRCTC Failed");

		System.out.println("PayTM Ended");
	}

}
