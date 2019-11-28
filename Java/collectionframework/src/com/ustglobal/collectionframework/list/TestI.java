package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
public static void main(String[] args) {
		
		Stack li = new Stack();
		li.add(12);
		li.add(34.5);
		li.add("Akshata");
		li.add(null);
		li.add(true);
		
		System.out.println("=====Using For Loop=====");
		for (int i = 0; i < li.size(); i++) 
		{
			System.out.println(li.get(i));
			
		}
		
		System.out.println("===========Using For Each===========");
		for(Object obj : li) {
			System.out.println(obj);
		}
		
		System.out.println("===========Using Iterator===========");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object object = it.next();
			System.out.println(object);
		}
		
		System.out.println("===========Using List Iterator==========");
		ListIterator l = li.listIterator();
		while(l.hasNext()) {
			Object o = l.next();
			System.out.println(o);
		}
		
		ListIterator lt = li.listIterator();
		System.out.println("----------->Forward");
		while(lt.hasNext()) {
			Object ob = lt.next();
			System.out.println(ob);
		}
		
		System.out.println("<------------BackwArd");
		while(lt.hasPrevious()) {
			Object o1 = lt.previous();
			System.out.println(o1);
		}

	}
	
}


	


