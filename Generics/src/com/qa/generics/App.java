package com.qa.generics;

public class App {
	
public static void main(String[]args) {
		
		Cage<String> myCage = new Cage<String>();
		myCage.setItem("hello, world!");
		System.out.println(getItem());
		
	
	
	}

public class Cage<T> {
	
	private T myItem;
//	private Two mySecondItem;
	
	public T getItem() {
		
		return this.myItem;
	}


public void setItem(T input) {
	
	this.myItem = input;
}
	

}

}

