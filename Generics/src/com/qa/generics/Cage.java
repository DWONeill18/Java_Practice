package com.qa.generics;

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