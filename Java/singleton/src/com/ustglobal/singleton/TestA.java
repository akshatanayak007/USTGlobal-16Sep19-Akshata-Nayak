package com.ustglobal.singleton;

public class TestA {

	public static void main(String[] args) {
		
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "helloo";
		System.out.println("Hashcode of ms "+ms.hashCode());
		System.out.println(ms.s);
		
		MySingleton m = MySingleton.getDbConnection();
		m.s="Hi";
		System.out.println("Hashcode of m"+m.hashCode());
		System.out.println(m.s);
		
		
		System.out.println(ms.s);
		
	}

}
