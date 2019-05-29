package com.qa.garage;

public class Bicycle extends Vehicle {

	private String mudguard;

	public Bicycle(String colour, String plate, String mudguard) {

		super(colour, plate);
		this.mudguard = mudguard;

	}

	public String getMudguard() {

		return mudguard;
	

	}

	@Override
	public String getAttributes() {
		// TODO Auto-generated method stub
		return mudguard + getColour() + getPlate();
		}
	
}
