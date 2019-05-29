package com.qa.Hospital;

import java.util.ArrayList;

public class Patient {
	
	private String name;
	private String medicine;
	private int	length;

	private static ArrayList<Patient> list = new ArrayList<Patient>();

//	list.add(4);
	
	public Patient(String name, String medicine, int length) {
		
		this.name = name;
		this.medicine = medicine;
		this.length = length;
		list.add(this);
		
		
	}
	
	public static ArrayList<Patient>  getList(){
		
		return list;
	}


	public String getName() {
		
		return name;
	}
	
	public String getMedicine() {
		
		return medicine;
	
	}
	
	public int getLength() {
		
		return length;
		
	}
	
}
