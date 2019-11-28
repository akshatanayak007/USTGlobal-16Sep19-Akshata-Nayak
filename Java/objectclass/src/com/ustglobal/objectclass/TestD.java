package com.ustglobal.objectclass;

public class TestD {

	public static void main(String[] args) {
	
	Student s1 = new Student(1, "Akshata", 87);
	int h1 = s1.hashCode();
	System.out.println("The hashcode is"+h1);
	
	System.out.println(s1);
	}
	

}
