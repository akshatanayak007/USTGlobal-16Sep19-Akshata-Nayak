package com.ustglobal.immutable;

public final class MyString {     					//final because we cannot override it; we can create object of final class
	
	private final int rollno;
	private final String name;

	public MyString(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public MyString changeContent(int rollno, String name) {
		MyString m = new MyString(rollno, name);
		return m;
	}

}
