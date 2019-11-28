package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA_HashSet {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(12);
		hs.add(123);
		hs.add(9.2);
		hs.add("Akshata");
		hs.add(null);
		hs.add(null);
		
		System.out.println("**************Using For Eaach **************");
		for(Object obj : hs) {
			System.out.println(obj);
		}
		
		System.out.println("************Using Iterator**************");
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
