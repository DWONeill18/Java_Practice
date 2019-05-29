package com.qa.inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import Java.util.io;

public class IntOut {
	
	public static void main(String[]args) throws IOException  {
		
		BufferedReader bfdRead = new BufferedReader( new FileReader("C:/Users/Admin/Desktop/inText.txt"));
				

		String line = bfdRead.readLine();

	
		
		while (line != null) {
			
			System.out.println(line);
			line = bfdRead.readLine();
		}

		
		BufferedWriter bfdWrite = new BufferedWriter( new FileWriter("C:/Users/Admin/Desktop/outText.txt"));
		
		bfdWrite.write("new line" + "\r\n");
		bfdWrite.write("yay!");
		bfdWrite.flush();

		bfdWrite.close();

		
		
		
		
		
	}
	


}