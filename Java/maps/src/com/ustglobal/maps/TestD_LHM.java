package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD_LHM {
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bengaluru", 560068);
		lh.put("Patna", 80002);
		lh.put("Haryana", 134203);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer val = m.getValue();
			System.out.println("Key is "+key+"-------- Value is "+val);
		}
	}

}
