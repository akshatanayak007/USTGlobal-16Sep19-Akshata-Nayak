package com.ustglobal.thread.defining;

public class TestThread {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		MyThread t1 = new MyThread();
		t1.start();
		
		/*   t1.run();
		 * 
		 *  Don't call run() method else it will behave like normal program 
		 * All code will be executed inside main thread only
		 * 
		 * */
		
		/*
		 * 				t1.start();
		 * If we try to call another start method on t1 we will f=get
		 * IllegalThreadException
		 */
		
		for(int i =0 ; i< 10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
		
	}

}
