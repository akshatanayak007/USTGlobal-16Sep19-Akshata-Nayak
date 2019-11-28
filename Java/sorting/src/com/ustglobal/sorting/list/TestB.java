package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class TestB {

	public static void main(String[] args) {
		
		LinkedList<Laptop> l1 = new LinkedList<Laptop>();
		l1.add(new Laptop(25000, 4 , "HP"));
		l1.add(new Laptop(35000, 6, "Dell"));
		l1.add(new Laptop(100000, 12, "MaC"));
		l1.add(new Laptop(50000, 8 , "Asus"));
		l1.add(new Laptop(20000, 2 ,"Acer"));
		
		
		
		Collections.sort(l1);
		
		displayLaptopDetails(l1);

	}
	
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand is "+lp.name);
			System.out.println("Price is "+lp.price);
			System.out.println("Ram is "+lp.ram);
		}
		
	}

}
