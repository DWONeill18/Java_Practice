package com.qa.Goldilocks;

public class App {

	public static void main(String[]args) {
		
		
		
	}
	
	public String goldilocks(int temp) {
			
		if (temp > 30) {
			
			return "Too Hot";
		}
		
		else if (temp < 10) {
			
			return "Too Cold";
		}
			
		else {
			return "Just right";
		}
		
	}
	
}
