package com.ustglobal.objectclass;

public class Student {
	int id;
	String name;
	double percentage;
	
	
@Override
public int hashCode() {
	return id;
}

@Override
public String toString() {
	return "Name is "+name+" Roll no is "+id+" percentage is "+percentage;
}
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}


}
