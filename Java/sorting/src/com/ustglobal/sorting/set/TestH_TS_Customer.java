package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH_TS_Customer {
	
	public static void main(String[] args) {
		
		SortByName_Custom sb = new SortByName_Custom();
		
		TreeSet<Customer>  ts = new TreeSet <Customer>(sb);
		ts.add(new Customer("Akshata",7,12000000));
		ts.add(new Customer("Pooja",5, 12000000));
		ts.add(new Customer("Meghana", 8, 222222));
		
		System.out.println("**********Using Iterator**********");
		Iterator<Customer> i1 = ts.iterator();
		
		while(i1.hasNext()) {
			Customer c = i1.next();
			System.out.println("Name of Customer is "+c.name);
			System.out.println("Id of Customer is "+c.id);
			System.out.println("Salary of Customer is "+c.Salary);
		}
		
		
		
	}

}
