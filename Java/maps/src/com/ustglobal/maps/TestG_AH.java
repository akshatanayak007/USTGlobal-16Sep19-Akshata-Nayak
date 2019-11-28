package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG_AH {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Akii",650000);
		Employee e2 = new Employee(2,"Chaithra",67900);
		Employee e3 = new Employee(3,"Pooja",450000);
		Employee e4 = new Employee(4,"Ankita",56000);
		Employee e5 = new Employee(5,"Arati",56790);
		Employee e6 = new Employee(6,"Vedika",56748);
		Employee e7 = new Employee(7,"Aneesha",67859);
		Employee e8 = new Employee(8,"Baseer",76859);
		Employee e9 = new Employee(9,"Salman",78563);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e3);
		al.add(e9);
		
		al1.add(e2);
		al1.add(e4);
		al1.add(e6);
		
		al2.add(e7);
		al2.add(e8);
		al2.add(e5);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		hm.put("Akshata", al);
		hm.put("Pooja", al1);
		hm.put("Meghana",al2);
		
		ArrayList<Employee> dec = hm.get("Akshata");
		
		Iterator<Employee> it = dec.iterator();
		
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("==============");
		}
		
		
		
	}
	

	

}
