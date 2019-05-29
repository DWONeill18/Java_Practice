package com.qa.blackjack;

public class blackjack {

	public static void main(String[]args) {
		
	System.out.println(decider(18,19));
	
	}
	
	public static int decider(int numOne, int numTwo) {
			
		
			if (numOne > numTwo && numOne <= 21) {
				return (numOne);
				}
			
			else if (numOne > numTwo && numOne > 21) {
				return (numTwo);
				}
			
			else if (numTwo > numOne && numTwo <= 21) {
				return (numTwo);
				}
			
			else if (numTwo > numOne && numTwo > 21) {
				return (numOne);
				}
			
			else if (numOne == numTwo && numOne <= 21 && numTwo <= 21) {
				return (numOne);
			}
			
			else {return(0);
			}
	}
}
			
	

