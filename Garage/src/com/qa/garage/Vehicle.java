package com.qa.garage;

abstract public class Vehicle {

	private String colour;
	private String plate;

	public Vehicle(String colour, String plate){
		
		this.colour = colour;
		this.plate = plate;
	}
	
	abstract public String getAttributes();


	public String getColour() {
		return colour;
	}

	public String getPlate() {
		
		return plate;
	}

	
}
