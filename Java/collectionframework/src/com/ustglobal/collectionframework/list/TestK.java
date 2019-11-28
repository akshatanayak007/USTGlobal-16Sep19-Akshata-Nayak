package com.ustglobal.collectionframework.list;

import java.util.List;
import java.util.ArrayList;

public class TestK {
	
	public static void main(String[] args) {
		
		ArrayList <Double> a1 = new ArrayList<Double>();
		
		a1.add(34.5);
		a1.add(23.5);
		a1.add(87.6);
		a1.add(12.3);
		a1.add(34.5);
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		
		a1.add(2, 54.6);
		System.out.println("After adding element to second index"+a1);
		a1.remove(0);
		System.out.println("After removing 0th index"+a1);
		a1.remove(null);
		System.out.println("After removing null "+a1);
		Double val = a1.get(4);
		System.out.println("The fourth element is "+val);
		a1.set(2, 77.6);
		System.out.println("After replacing 2nd index "+a1);
		a1.clear();
		System.out.println("After clear method "+a1);
		a1.contains(54.6);
		
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		
		a1.addAll(al1);
		System.out.println("After adding all "+a1);
		
		boolean contain = a1.containsAll(al1);
		System.out.println("Contains all elems of al1 "+contain);
		
		boolean res = a1.removeAll(al1);
		System.out.println("Removed all elemns of al1 "+res);
		
		
		
	}

}
