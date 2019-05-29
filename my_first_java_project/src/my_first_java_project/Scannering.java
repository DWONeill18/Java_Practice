package my_first_java_project;

import java.util.Scanner;
import java.util.ArrayList;

public class Scannering {
	
	public static void main(String[]args) {

		ArrayList<String> mylist = new ArrayList<String>();
		boolean begin = true;
		
		while (begin) {
		
		System.out.println("What would you like to do?");
		String t = input();
	
		
		if (t.equals("add")) {
			mylist.add(input());
			System.out.println("What would you like to do?");
		}
		
		
		else if (t.equals("show")) {
			
			System.out.println(mylist);
			System.out.println("What would you like to do?");
		}
		
		
	
		else if (t.equals("delete")) {
			mylist.remove(input());
			System.out.println("What would you like to do?");
		}
		
	
		else if (t.equals("exit")) {
			begin = false;
			// OR
		}
		
		else {System.out.println("Input not recognised");
		
		
		
		}
		
		}
}


public static String input() {
	
	Scanner s = new Scanner(System.in);
	String input = s.nextLine();
	return input;
}

}