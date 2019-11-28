package com.ustglobal.exception.second;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
		Thread.sleep(3000);
		System.out.println("Inside Try");
		}
		catch(InterruptedException ie) {
			System.out.println("Exception caught");
			ie.printStackTrace();
		}
		
		System.out.println("Main Ended");
	}

}
