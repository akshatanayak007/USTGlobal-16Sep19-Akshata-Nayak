package com.ustglobal.maps;

import java.util.HashMap;

public class TestB_HM {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Kavita", 889758564);
		hm.put("Mala", 364782938);
		hm.put("Baala", 675932084);
		hm.put(null,5467492);												
		hm.put("Ankush", null);
		hm.put("Vedika", null);	
		
		
		HashMap hm1 = new HashMap();
		hm1.put("Deepu",4532144);
		hm1.put("akii",34553223);
		hm1.put("Kriti",32166775);
		
		boolean b = hm.containsKey("Baala");				//to check whether the given key is present if it is present than it will send true else false.
		System.out.println("Has Key?? "+b);
		
		boolean v = hm.containsValue(67489495);     //to check whether the vlaue is present.
		System.out.println("Has Value?? "+v);
		
		System.out.println("Before putAll method "+hm);
		hm.putAll(hm1);									//to copy all the elements present in one map to another hashmap.
		System.out.println("After putAll method "+hm);
		
		System.out.println("Size of the map "+hm.size());			//to check the size of the map.
		
		System.out.println("Map is empty "+hm.isEmpty());			//to check whether the map is empty.
		
		hm.clear();								//to delete all the elements from the map                           
		System.out.println("Values "+hm);    //there is no index for the hashMap.
	}
	
										
	

}
