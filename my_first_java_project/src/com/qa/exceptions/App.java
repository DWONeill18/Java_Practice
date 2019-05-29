package com.qa.exceptions;

import java.io.IOException;

public class App {

	public static void main(String[]args) throws Exception {
		
//		try {
//			
//			
//			int x = 3/0;
//		}
//		
//		catch(ArithmeticException e) {
//			
//			System.out.println(e.toString());
//			
//			System.out.println("Computer exploding noise");
		
//		throw new ArithmeticException();
		
		//throws out an exception
		
//		try {
//		method1();
//		} catch(ArithmeticException e) {
//			System.out.println("bad method");
//		}
		
	//	
//		public static void method1() {
//			throw new ArithmeticException();

	try {
		throw new IOBrokenException();
		
	} catch(IOBrokenException ian) {
		
		System.out.println(ian.toString());
	}
	
	}

	
	class IOBrokenException extends RuntimeException {
		
		public String toString() {
			
			return "ian had a long day";
			
		}
		
	}
	
	
}	

