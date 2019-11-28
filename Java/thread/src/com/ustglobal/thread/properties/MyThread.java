package com.ustglobal.thread.properties;

public class MyThread extends Thread {
	
	public static void main(String[] args) {
		
		
		System.out.println("Main Started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("Current Thread : "+tname);
		
		Thread.currentThread().setName("Bala");
		System.out.println("Changed name of Thread : "+Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		String name = t1.getName();
		System.out.println("MyThread name is "+name);
		
		t1.setName("Golu");
		System.out.println("MyThread Name after changing is : "+t1.getName());
		
		System.out.println(10 / 0);
		/*
			* Exception in thread "main" java.lang.ArithmeticException: / by zero at
			* com.ustglobal.thread.properties.MyThread.main(MyThread.java:16)
		*/
		System.out.println("main Ended");
		
	}

}
