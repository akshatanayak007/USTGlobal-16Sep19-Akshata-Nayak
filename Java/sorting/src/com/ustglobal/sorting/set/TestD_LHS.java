package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD_LHS {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Double>ls = new LinkedHashSet<>();
		ls.add(3.4);
		ls.add(23.4);
		ls.add(89.9);
		ls.add(3.4);
		ls.add(null);
		ls.add(null);
		
		
		System.out.println("********** Using for each ***********");
		for(Object s : ls) {
			System.out.println(s);
		}
		
		System.out.println("********** Using Iterator ***********");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}

}
