package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	
	public static void main(String[] args) {
		
		ArrayList<Marker> a1 =new ArrayList<Marker>();
		
		a1.add(new Marker(30, "blue"));
		a1.add(new Marker(30, "Red"));
		a1.add(new Marker(30, "Green"));
		a1.add(new Marker(30, "Black"));
		
		System.out.println("Before Sorting");
		display(a1);
		SortByPrice sb = new SortByPrice();
		Collections.sort(a1,sb);
		display(a1);
		
		SortByColor sc = new SortByColor();
		Collections.sort(a1,sc);
		System.out.println("After Sorting");
		display(a1);
		
		
	}
	
	private static void display(ArrayList<Marker> al1) {
		Iterator<Marker> i1 = al1.iterator();
		
		while(i1.hasNext()) {
			Marker m = i1.next();
		System.out.println("Color is "+m.color);
		System.out.println("Cost is "+m.cost);
		}
	}

}
