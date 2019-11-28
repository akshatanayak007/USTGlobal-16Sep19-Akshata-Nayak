package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.*;
import com.ustglobal.studentapp.jspiders.React;

public class TestA {

	public static void main(String[] args) {
		
		QTP q = new QTP();
		q.teachQTP();
		
		Selenium s = new Selenium();
		s.teachSelenium();
		
		com.ustglobal.studentapp.jspiders.Angular a = new com.ustglobal.studentapp.jspiders.Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();

	}

}
