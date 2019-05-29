package com.qa.interfaces;

public class Bee extends Animal implements See, Fly {
	
	public void flap() {
		System.out.println("swish swish");
	}
	
	public void sight() {
		System.out.println("Honeycomb");
	}
	
	public void eyes() {
		System.out.println("Bee Eyes");
	}
	

}
