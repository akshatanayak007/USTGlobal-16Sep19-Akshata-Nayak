package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(45);
		l.add(24);
		
		System.out.println("Before Peek--------->"+l);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element "+peekElement);
		
		Integer peeFirstElement = l.peekFirst();
		System.out.println("Peek First Element "+peeFirstElement);
		
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Last Element "+peekLastElement);
		
		System.out.println("After Peek-------->"+l);
		
		
		
		System.out.println("Before Poll--------->"+l);
		
		Integer pollElement = l.poll();
		System.out.println("poll Element "+pollElement);
		
		Integer pollFirstElement = l.pollFirst();
		System.out.println("poll First Element "+pollFirstElement);
		
		Integer pollLastElement = l.pollLast();
		System.out.println("poll Last Element "+pollLastElement);
		
		System.out.println("After poll-------->"+l);
		
		
		
		
		 l.push(12);
		System.out.println("After Push-------->"+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After Pop--------->"+l);
		
		
	}

}
