package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE_TreeMap {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("Bengaluru", 560068);
		lh.put("Patna", 80002);
		lh.put("Haryana", 134203);
//		lh.put(null,4566433);		we cannot add null values for key and value and we cannot add other values than generic
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer val = m.getValue();
			System.out.println("Key is "+key);
			System.out.println("Value is "+val);
			System.out.println("================");
		}
		
	}
	
	

}
