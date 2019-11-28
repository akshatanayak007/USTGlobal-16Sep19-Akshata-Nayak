package com.ustglobal.sorting.set;

import java.util.TreeSet;
import java.util.Iterator;

public class TestH_TS {
	
public static void main(String[] args) {
		
		TreeSet<Employee> hs = new TreeSet<Employee>();
		
		hs.add(new Employee(12, "Shailaja", 450000));
		hs.add(new Employee(07,"Akii", 600000));
		hs.add(new Employee(34, "Raju", 175000));
		hs.add(new Employee(05, "Vidya", 330000));
		hs.add(new Employee(05, "Vidya", 330000));   
		
		System.out.println("********** Using Iterator ***********");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("-------------------------------------");
		}
		
		
	}

}
