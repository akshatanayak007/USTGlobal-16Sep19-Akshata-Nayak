package com.ustglobal.hasarelation.weak;

public class TestA_HasArelation {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println("p.name");
		p.sleep();
		p.eat();
		p.m.write();
		System.out.println("color is "+p.m.color);
	}

}
