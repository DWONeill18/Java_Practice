package com.qa.garage;

public class Car extends Vehicle {

	private String make;
	private int mileage;
	
	public void running() {
		System.out.println("running..");

	}

	public Car(String make, int mileage, String colour, String plate) {
		super (colour, plate);
		this.make = make;
		this.mileage = mileage;
	
		
	}

	
	public String getMake() {

		return make;
	}

	public int getMileage() {

		return mileage;
	}

	@Override
	public String getAttributes() {
		// TODO Auto-generated method stub
	
		return make + mileage + getColour() + getPlate();
		

	}

}
