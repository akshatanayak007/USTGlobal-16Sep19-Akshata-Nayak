package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("MyId Thread "+mi.getId());
		
		System.out.println("Priority of Main Thread "+Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(16);               To set the priority greater than 10 or less than 1
		/*
		 * Exception in thread "main" java.lang.IllegalArgumentException at
		 * java.lang.Thread.setPriority(Thread.java:1089) at
		 * com.ustglobal.thread.properties.MyIdThread.main(MyIdThread.java:15)
		 */
		
		System.out.println("Main Ended");
		
	}
	
}
