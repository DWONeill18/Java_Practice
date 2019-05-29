package com.qa.animal_kindgdom;

public class Fish extends Animal {

	public void swim() {

		System.out.println("splash");

	}

	private int fins;

	public Fish(int fins, int age) {
		super(age);
		this.fins = fins;

	}

	public int getFins() {

		return fins;
	}
}
