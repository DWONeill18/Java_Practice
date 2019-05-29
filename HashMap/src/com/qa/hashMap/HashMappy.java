package com.qa.hashMap;

import java.util.HashMap;

public class HashMappy {
	
	public static void main(String[]args) {
		
		HashMap<String, String> myMap = new HashMap<String, String>();
		
		String bird = "A bird has wings";
		
		myMap.put("Bird", bird);
		
		System.out.println(myMap.get("Bird"));
		
		
		/*######################################################*/
		
		
		HashMap<String, Bird> birdMap = new HashMap<String, Bird>();
		
		Bird birddy = new Bird("blue");
		
		birdMap.put("bluejay", birddy);
		
		System.out.println(birdMap.get("bluejay").belly);
	}
	

}