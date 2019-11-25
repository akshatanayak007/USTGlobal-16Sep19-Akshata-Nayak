package com.ustglobal.mobileapp;

import java.util.Scanner;

import com.ustglobal.mobileapp.dao.MobileDAOImpl;

public class MobileApp {
public static void main(String[] args) {
	for(;;) {
		System.out.println("press 1 to show all the contacts");
		System.out.println("press 2 to search for contacts");
		System.out.println("press 3 to opearte on contcts");
		try{
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			
			MobileDAOImpl dao=new MobileDAOImpl();
			switch (ch) {
			case 1:
				dao.showAllContacts();
				break;
			case 2:
				System.out.println("Enter the name  you want to search");
				String name=sc.next();
				dao.search(name);
				break;
			case 3:
				dao.operateOnContacts();
			default:
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
