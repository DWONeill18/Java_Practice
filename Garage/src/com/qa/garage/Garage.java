package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car("audi", 200, "blue", "XFG467H");
		Vehicle vehicle2 = new Motocycle("yamaha", 600, "red", "PDF563G", 120);
		Vehicle vehicle3 = new Bicycle("yellow", "PXX222A", "yes");
		
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add(vehicle);
		list.add(vehicle2);
		list.add(vehicle3);

//		for (int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i).getAttributes());
//		}
//		
//		for (int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i).getPlate());
//		}
		
		for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getColour());
			
		}
		
		
//		Bill calculation

int bill(int num1, int num2, int num3);

		num1 + num2 + num3;
				System.out.println(total);
		
//		public float bill(float total, float  ) {
//			
//		
//			 
//			if (list.get(0).getColour() = blue){
//				total += 
//		
//					}
		
		
	

}

}
