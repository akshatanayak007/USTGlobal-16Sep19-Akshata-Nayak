package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF_TS {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("roopa");
		ts.add("Jaya");
		ts.add("Sushma");
		ts.add("Munni");
		ts.add("sheela");
		
		System.out.println("********** Using for each ***********");
		for(Object s : ts) {
			System.out.println(s);
		}
		
		System.out.println("********** Using Iterator ***********");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}
		
}
	

