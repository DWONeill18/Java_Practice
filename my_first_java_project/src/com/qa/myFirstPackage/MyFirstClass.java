package com.qa.myFirstPackage;

public class MyFirstClass {

	
	public static void main(String[]args) {
	
		int numOne = 18;
		int numTwo = 19;
			
		
	if (numOne > numTwo && numOne <= 21) {
		System.out.println(numOne);
		}
	
	else if (numOne > numTwo && numOne > 21) {
		System.out.println(numTwo);
		}
	
	else if (numTwo > numOne && numTwo <= 21) {
		System.out.println(numTwo);
		}
	
	else if (numTwo > numOne && numTwo > 21) {
		System.out.println(numOne);
		}
	
	else if (numOne == numTwo && numOne <= 21 && numTwo <= 21) {
		System.out.println("Tie");
	}
	
	else {System.out.println(0);
	}
	
}

}