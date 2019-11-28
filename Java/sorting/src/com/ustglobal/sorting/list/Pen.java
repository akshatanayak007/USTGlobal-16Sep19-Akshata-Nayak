package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
	
	double price;
	String brand;
	
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	@Override
	public int compareTo(Pen o) {
		String a = this.brand;
		String b = o.brand;
		
		return a.compareTo(b);
		
		
	}

}
