package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class TestJ_PriorityQ {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		System.out.println(v.capacity());
		
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
	
		
		System.out.println(v.capacity());
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(23);
		pq.add(34);
		pq.add(45);
		pq.offer(34);
		
		System.out.println("Before Poll "+pq);
		System.out.println("***********Using Iterator*************");
		Iterator i1 = pq.iterator();
		
		while(i1.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After Poll "+pq);
		
//		pq.add("Akii");      We can only add generic type
//     pq.add(null);           NullPointerException
		
	}

}
