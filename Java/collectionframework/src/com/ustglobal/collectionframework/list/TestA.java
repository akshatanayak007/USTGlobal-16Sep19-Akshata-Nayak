package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
			
		ArrayList a = new ArrayList();
		a.add("Akki");
		a.add(1);
		a.add('N');
		a.add(5.4);
		a.add(null);
		
		Object o = a.get(2);
		System.out.println(o);
		
		for(int i =0; i<5;i++) {
			
		Object	obj = a.get(i);
		System.out.println(obj);
			
		}
	}

}
