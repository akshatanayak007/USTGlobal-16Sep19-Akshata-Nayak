package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {

		Student s1 = new Student(2, "divya", 67.89);
		Student s2 = new Student(3, "Akii", 79.86);
		Student s3 = new Student(1, "Chaithra", 78.6);
		Student s4 = new Student(24, "Pooja", 78.9);
		Student s5 = new Student(12, "Arati", 67.8);
		Student s6 = new Student(13, "Ankita", 89.0);
		Student s7 = new Student(19, "Vidya", 78.6);
		Student s8 = new Student(16, "Dimple", 67.54);
		Student s9 = new Student(11, "Sweety", 78.3);
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		

		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("First", a1);
		hm.put("Second", al1);
		hm.put("Third", al2);
		
		ArrayList<Student> fin = hm.get("Second");
		
		Iterator<Student> it = fin.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("===================");
		}
		
		
		
		

	}
}
