package com.ustglobal.exception.customizedcheckedexception;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);

		try(Scanner sc = new Scanner(System.in); Scanner sc2 = new Scanner(System.in)){
			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println(age/0);
			
			if(age<18) {
				System.out.println("Who allowed you Here?");
			}
			else {
				System.out.println("You are most welcome");
			}
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
	}

}
