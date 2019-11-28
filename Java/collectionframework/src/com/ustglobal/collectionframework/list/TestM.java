package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Girija");
		a1.add("venija");
		a1.add("Akshata");
		a1.add("Pooja");
		
		System.out.println("Before sort------>"+a1);
		Collections.sort(a1);
		System.out.println("After sort------->"+a1);

	}

}
