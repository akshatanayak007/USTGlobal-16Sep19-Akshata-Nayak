package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmp {
	
	public static void main(String[] args) {
		
		Comparator<Employee2> comp = (e1,e2) -> {
			if(e1.height > e2.height) {
				return 1;
			}
			else if(e1.height <e2.height) {
				return -1;
			}
			else {
				return 0;
			}
		};
		
		TreeSet<Employee2> ts = new TreeSet<Employee2>(comp );
		
		ts.add(new Employee2(07,"Akii",5.6));
		ts.add(new Employee2(1,"Bhaskar",5.8));
		ts.add(new Employee2(5,"Suresh",5.9));
		ts.add(new Employee2(4,"Dinesh",6.0));
		
		System.out.println("Using iterator");
		Iterator<Employee2> it = ts.iterator();
		
		while(it.hasNext()) {
			Employee2 e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
		}

	}

}
