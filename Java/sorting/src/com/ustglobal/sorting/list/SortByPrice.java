package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPrice implements Comparator<Marker> {
	
	@Override
	public int compare(Marker o1, Marker o2) {
		
		double s = o1.cost;
		double t = o2.cost;
		
		if(s>t) {
			return 1;
		}
		else if(s<t) {
			return -1;
			
		}
		else {
			return 0;
		}
	}

}
