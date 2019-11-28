package com.ustglobal.hasarelation.weak;

public class TestB_CarhasAMusic {
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("Music name is "+c.m.musicname);
		c.m.playmusic();
		c.move();
		c.stop();
	}

}
