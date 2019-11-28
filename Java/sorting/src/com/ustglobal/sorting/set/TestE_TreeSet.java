package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE_TreeSet {
	
	public static void main(String[] args) {
		
		TreeSet ls = new TreeSet();
		ls.add(34);
		ls.add(65);
		ls.add(55);
		ls.add(34);
		ls.add(70);
//		ls.add("Akii");  Class cast exception
//		ls.add(null);   NullPointerException , no null values are supported in treeSet
		
		
		
		System.out.println("********** Using for each ***********");
		for(Object s : ls) {
			System.out.println(s);
		}
		
		System.out.println("********** Using Iterator ***********");
		Iterator<Object> it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}

}
