package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH_HashTable {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(5001,"Akii");
		ht.put(102,"Pooju");
		ht.put(103,"Megha");
		ht.put(1009, "Chai");
		ht.put(103,"Meghu");
//		ht.put(null,"Avinash");						We cannot add null for Key we get Null Pointer Exception hence we cannot add null keys to the hashTable
//		ht.put(109,null);								We cannot add null for values we get NullPointerexception hence we cannot add null values to the HashTable
		System.out.println("Data "+ht);
		
	}

}
