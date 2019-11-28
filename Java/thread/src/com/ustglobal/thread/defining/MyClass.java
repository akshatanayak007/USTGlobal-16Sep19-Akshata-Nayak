package com.ustglobal.thread.defining;

public class MyClass extends Thread implements Runnable{
	
	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		m.start();
		
	}

}
