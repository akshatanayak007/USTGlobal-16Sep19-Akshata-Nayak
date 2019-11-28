package com.ustglobal.thread.defining;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		System.out.println("Main Startted");
		
		MyRunnable mr = new MyRunnable();
		/*
		 * mr.start(); 
		 * we cannot call start method because it is present in Thread Class
		 * and not present in runnable interface
		 * and hence we need to create the object of thread class and pass the reference variable to the Thread Class Constructor
		 */
		
		Thread t1 = new Thread(mr);
		t1.start();
		
		for(int i =0 ; i<10; i++) {
			System.out.println("Main Thread");
		}
		System.out.println("Main Ended");
	}

}
