package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {
	
	@Override
	public int compare(Bank o1, Bank o2) {
	
		Long a = o1.micr;
		Long b = o2.micr;
		
		return a.compareTo(b);
	
	}

}
