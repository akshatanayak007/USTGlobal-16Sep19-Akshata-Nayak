package com.ustglobal.objectclass;

public class usbPort {
	
	public void connectDevice(Object obj) {
		if(obj instanceof PenDrive) {
			PenDrive p =(PenDrive)obj;
			p.read();
			p.write();
		}
		
		else if(obj instanceof  Mouse) {
			Mouse m =(Mouse)obj;
			m.click();
			m.scroll();
		}
		else {
			System.out.println("External Device cannot be Recognized");
		}
	}

}
