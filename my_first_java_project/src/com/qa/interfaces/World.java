package com.qa.interfaces;

import java.util.ArrayList;

public class World {
	

		public static void main(String[] args) {
			
//			Dog retriever = new Dog();
//			retriever.bork();
//			retriever.eyes();
//			retriever.flap();
//			retriever.sight();
//			
			Dog dog = new Dog();
			Bee b = new Bee();
			
			ArrayList<See> sighted = new ArrayList<See>();
			
			sighted.add(dog);
			sighted.add(b);
			
			sighted.get(0).sight();
			sighted.get(1).sight();
			sighted.get(0).eyes();
			sighted.get(1).eyes();
		
		
			
		}

	
}
