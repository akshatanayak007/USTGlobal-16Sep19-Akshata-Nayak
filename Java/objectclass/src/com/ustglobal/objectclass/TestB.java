package com.ustglobal.objectclass;

public class TestB {

	public static void main(String[] args) {
		Pen p = new Pen();
		int v =p.hashCode();
		System.out.println("The Hashcode value of p is "+v);
		
		Pen q = new Pen();
		System.out.println("The Hashcode value of q is "+q.hashCode());
		
		String n = q.toString();
		System.out.println("The toString value returns "+n);

	}

}
