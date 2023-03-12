package lab1;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Length : ");
		float length = scan.nextFloat();
		System.out.print("Enter Width : ");
		float width = scan.nextFloat();
		System.out.print("Enter Height : ");
		float height = scan.nextFloat();
		
		double volume = height * width * length;
		
		System.out.println("Volume = " +volume);
		
		
	}

}
