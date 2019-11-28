package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
//	@Override
//	public int compareTo(Student o) {
//		if(this.id > o.id) {
//			return 1;
//		}
//		else if(this.id < o.id){
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
	
//	@Override
//	public int compareTo(Student o) {
//		if(this.percentage > o.percentage) {
//			return 1;
//		}
//		else if(this.percentage < o.percentage){
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}

	@Override
	public int compareTo(Student s) {
		Integer i = this.id;
		Integer j = s.id;
		
		//  int  i = this.id; 							this is wrong because we only have wrapper classes which implelments comparable 
		
		return i.compareTo(j);
		
	}
}
//	@Override
//	public int compareTo(Student o) {
//		
//		String p = this.name.toLowerCase();
//		
//		String q = o.name.toLowerCase();
//		return p.compareTo(q);  
		///This is not recursion we have compareTo method for string class and we are calling that compareTo method
	
		//or return p.compareTo(q).
	

