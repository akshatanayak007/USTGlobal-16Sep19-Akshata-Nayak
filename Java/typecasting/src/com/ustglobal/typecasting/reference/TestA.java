package com.ustglobal.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		Pen p = new Marker();                     //Upcasting
		System.out.println(p.cost);
		p.write();		
		//We will get the overridden implementation
		
		Marker m = (Marker) p;                  //Downcasting
		System.out.println(m.size);
		m.color();
		m.write();
		//We will get all child class implementations

	}

}
