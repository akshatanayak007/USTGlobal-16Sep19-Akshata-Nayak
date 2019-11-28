package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Pen> a1 = new ArrayList<Pen>();
		
		a1.add(new Pen(5, "Reynolds"));
		a1.add(new Pen(10,"Brite"));
		a1.add(new Pen(20,"Cello Faster"));
		a1.add(new Pen(30,"Faber Castell"));
		a1.add(new Pen(35,"Zen"));
		
		displayPenDetails(a1);
		
		Collections.sort(a1);
		displayPenDetails(a1);
		
	}	
	static void displayPenDetails(ArrayList<Pen> l) {
		Iterator<Pen> it = l.iterator();
		
		while(it.hasNext()) {
			Pen lp = it.next();
			System.out.println("Brand is "+lp.brand);
			System.out.println("Price is "+lp.price);
		}
	}

	}


		



