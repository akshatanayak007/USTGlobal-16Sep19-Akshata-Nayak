package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
			
		ArrayList a = new ArrayList();
		a.add(97);
		a.add("Akshata");
		a.add(3.5);
		a.add(true);
		
		Iterator i1 = a.iterator();
		Object o = i1.next();
		System.out.println("Obj1 "+o);
		
		Object o2 = i1.next();
		System.out.println("Obj2 "+o2);
		
		boolean b = i1.hasNext();
		System.out.println("Has NExt is "+b); // if the size exceeds we get NoSuchElementExistsException
		
		for(int i =0; i<a.size(); i++) {
			
			Object ob = a.get(i);
			System.out.println(ob);
		}
		
		
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add("Akshata");
		a1.add(37.65);
		a1.add('N');
		
		Iterator i2 = a1.iterator();
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
