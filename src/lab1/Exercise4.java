 package lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//or
//import java.io.*

public class Exercise4 {
	
	public static void main(String args[]) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		//or
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Length : ");
		double length = Double.parseDouble(reader.readLine());
		
		System.out.print("Enter Width : ");
		double width = Double.parseDouble(reader.readLine());
		
		System.out.print("Enter Height : ");
		double height = Double.parseDouble(reader.readLine()); //return string values
		
		double volume = height * width * length;
		
		System.out.println("Volume = " +volume);
		
		
	}

}
