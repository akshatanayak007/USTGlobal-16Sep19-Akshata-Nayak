package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC_Linked_HM {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bengaluru", 560068);
		lh.put("Patna", 80002);
		lh.put("Haryana", 134203);
		
		System.out.println(lh);
		
		Set<String> s = lh.keySet();								//to get the keys.
		for(String key :  s) {
			System.out.println("Key "+key);
		}
		
		Collection<Integer> c = lh.values();  //to get the values
		System.out.println("Value is "+c);
		
	}

}
