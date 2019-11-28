package com.ustglobal.google;

public class TestB_Abstraction2 {

	public static void main(String[] args) {
		
		Browser b = new Browser();
		
		Google g = new Gmail();
		b.open(g);
		
		GoogleDrive gd = new GoogleDrive();
		b.open(gd);
		
	}

}
