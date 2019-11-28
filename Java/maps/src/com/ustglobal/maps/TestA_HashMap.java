package com.ustglobal.maps;

import java.util.HashMap;

public class TestA_HashMap {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("Kavita", 889758564);
		hm.put("Mala", 364782938);
		hm.put("Baala", 675932084);
		hm.put(null,5467492);												//we can add null value to the keys only once.
		hm.put("Ankush", null);
		hm.put("Vedika", null);											//we can add any number of times the null to the value
		
		
		System.out.println("Data "+hm);
		hm.put("Baala", 56748393);									//Keys cannot be duplicate it will modify the previous value to new value
		System.out.println("Data "+hm);
		hm.put("Saala", 56748393);
		System.out.println("Data "+hm);		//Values can be duplicate
		hm.put(null, 23345532);
		System.out.println("After Null value adding----->");					//We cannot add two null keys
		System.out.println("Data "+hm);
		
		Object phoneno = hm.get("Sheela");
		System.out.println("Value " +phoneno);
		
		Object phone2 = hm.get("Akii");	
		System.out.println("Value "+phone2);										//Trying to access value which is not present in the map it will return null as value
	
		Object val = hm.remove("Saala");
		System.out.println("Removed value is "+val);						//Removing the value present in the map.
		
		System.out.println("After removing the value "+hm);
	}
	

}
