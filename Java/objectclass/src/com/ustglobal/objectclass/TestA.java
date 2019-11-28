package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		
		PenDrive p =new PenDrive();
		usbPort u = new usbPort();
		u.connectDevice(p);
		
		Object m = new Mouse();
		u.connectDevice(m);
		
	}

}
