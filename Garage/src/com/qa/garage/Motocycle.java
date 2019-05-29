package com.qa.garage;

public class Motocycle extends Vehicle{
	
	private String make;
	private int mileage;
	private int engine;
	
	public Motocycle(String make, int mileage, String colour, String plate, int engine) {
		
		super (colour, plate);
		this.make = make;
		this.mileage = mileage;
		this.engine = engine;
		
	}

	public String getMake() {

		return make;
	}

	public int getMileage() {

		return mileage;
		
	}
	
	public int getEngine() {
		
		return engine;
	}

	@Override
	public String getAttributes() {
		// TODO Auto-generated method stub
		return mileage + make + engine + getColour() + getPlate();
	}
}
