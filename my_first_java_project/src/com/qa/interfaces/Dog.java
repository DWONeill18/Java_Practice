package com.qa.interfaces;

public class Dog extends Animal implements See, Fly{
	
	public void bork() {
		System.out.println("Bork Bork");
	}

	public void sight() {
		System.out.println("Black and white");
	}
	
	public void eyes() {
		System.out.println("Puppy Eyes");
	}
	
	public void flap() {
		System.out.println("swish swish");
	}
	
}
