//package my_first_java_project;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Creatingtask {
//	
//	public static void main(String[]args) {
//		
//		
//		
//		ArrayList<BankAccount> accountlist = new ArrayList<BankAccount>();
//		
////		String h = input();
////		int x = input2();
////		BankAccount y;
////		y = new BankAccount(h, x);
////		System.out.println("Current Balence:");
////		System.out.println(y.balence);
//		
//		boolean begin = true;
//		
//		while (begin) {
//			
//		System.out.println("What would you like to do?");
//		
//		String k = input();
//		
//		if (k.equals("add")) {
//			System.out.println("Enter name:");
//			String name = input();
//			System.out.println("Enter balence:");
//			int balence = input2();
//			accountlist.add(new BankAccount( name, balence ));
//			//System.out.println(y.balence);
//		}
//		
//		else if (k.equals("delete")) {
//			System.out.println("Remove name:");
//			String name = input();
//			for (BankAccount b : accountlist) {
//				if (b.name.equals(name)) {
//					accountlist.remove(b);
//					break;
//				}
//			}
//		}
//		
//		else if (k.equals("show")) {
//			System.out.println("Enter name:");
//			String name = input();
//			
//			for (BankAccount account :accountlist) {
//				if (account.name.equals(name)) {
//					System.out.println(account.balence);
//					break;
//				}
//			}	
//		}
//		
//		else {
//			System.out.println("Input not recognised");
//			begin = false;
//		}
//		}
//		
//	}
//		
//	public static String input() {
//		
//		Scanner s = new Scanner(System.in);
//		String input = s.nextLine();
//		return input;
//	}
//	
//	public static int input2() {
//		
//		Scanner s = new Scanner(System.in);
//		int input = s.nextInt();
//		return input;
//	}
//	
//	
//	
//}

package my_first_java_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Creatingtask {
	
	public void Onlinebank(){
		
	
		ArrayList<BankAccount> accountlist = new ArrayList<BankAccount>();
		
//		String h = input();
//		int x = input2();
//		BankAccount y;
//		y = new BankAccount(h, x);
//		System.out.println("Current Balence:");
//		System.out.println(y.balence);
		
		boolean begin = true;
		
		while (begin) {
			
		System.out.println("What would you like to do?");
		
		String k = input();
		
		if (k.equals("add")) {
			System.out.println("Enter name:");
			String name = input();
			System.out.println("Enter balence:");
			int balence = input2();
			accountlist.add(new BankAccount( name, balence ));
			//System.out.println(y.balence);
		}
		
		else if (k.equals("delete")) {
			System.out.println("Remove name:");
			String name = input();
			for (BankAccount b : accountlist) {
				if (b.name.equals(name)) {
					accountlist.remove(b);
					break;
				}
			}
		}
		
		else if (k.equals("show")) {
			System.out.println("Enter name:");
			String name = input();
			
			for (BankAccount account :accountlist) {
				if (account.name.equals(name)) {
					System.out.println(account.balence);
					break;
				}
			}	
		}
		
		else {
			System.out.println("Input not recognised");
			begin = false;
		}
		}
		
	}
		
	public String input() {
		
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
	
	public int input2() {
		
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		return input;
	}
	
	
	
}		



