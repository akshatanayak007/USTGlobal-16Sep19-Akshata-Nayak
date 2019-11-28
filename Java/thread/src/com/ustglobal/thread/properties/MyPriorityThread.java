package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		int p = Thread.currentThread().getPriority();
		System.out.println("Main Thread Priority "+p);
		
		MyPriorityThread t1 = new MyPriorityThread();
		int q = t1.getPriority();
		System.out.println("MyPriority Thread Priority "+q);
		
		Thread.currentThread().setPriority(7);
		System.out.println("Main Thread Priority is "+Thread.currentThread().getPriority());
		
		MyPriorityThread t2 = new MyPriorityThread();
		int q1 = t2.getPriority();
		System.out.println("MyPriority Thread2 Priority "+q1);
		
		t2.setPriority(8);
		System.out.println("MyPriority Thread2 Priority after changing "+t2.getPriority());
		
		System.out.println("Main Ended");
		
	}

}
