package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI_TS_Bank {
	
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMicr sm = new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		ts.add(new Bank("HDFC", 560068, 6788564));
		ts.add(new Bank("Corporation",5460045, 67859342));
		ts.add(new Bank("SBI", 560071, 76568674));
		ts.add(new Bank("Canara", 3452212, 76554833));
		ts.add(new Bank("Canara", 3452212, 76554833));
		
		System.out.println("************Using Iterator***************");
		
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Id is "+b.micr);
			System.out.println("Name is "+b.name);
			System.out.println("Salary is "+b.pincode);
			System.out.println("-------------------------------------");
		}
	}

}
