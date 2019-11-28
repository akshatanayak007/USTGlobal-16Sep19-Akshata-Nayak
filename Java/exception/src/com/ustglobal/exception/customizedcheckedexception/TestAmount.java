package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(50000);
			System.out.println("Collect your cash and get lost!!");
		} catch (InvalidAmountException e) {
			
			System.err.println(e.getMessage());
			
			e.printStackTrace();
		}
		
		System.out.println("Main Ended");
	}
	
	
}
