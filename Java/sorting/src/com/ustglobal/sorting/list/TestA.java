package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student(12, "Dimple", 56);
		Student s2 = new Student(07,"Akshata",75.6);
		a1.add(new Student(2,"sweety",30.8));
		
		a1.add(s1);
		a1.add(s2);
		
		System.out.println("Before Sorting");
		displayStudentDetails(a1);
		Collections.sort(a1);
		
		System.out.println("After Sorting");
		displayStudentDetails(a1);
		
		
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("--------------------------------");
			
		}
	}

}
