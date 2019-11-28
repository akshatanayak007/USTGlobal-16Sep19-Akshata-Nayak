package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {

		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student(101, "Akshata", 78);
		Student s2 = new Student(102, "Salman Zaidi", 77);
		Student s3 = new Student(103, "Shahrukh", 65);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for (int i = 0; i < a1.size(); i++) {
			
			Student s = a1.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage "+s.percentage);
			
		}
		
		System.out.println("========For Each=======");
		for(Student s : a1)
		{
			System.out.println(s);
		}

	}

}
