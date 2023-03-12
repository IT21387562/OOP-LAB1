package lab1;

import java.util.Scanner;

public class Demo {
	
	public static void main(String args[]) {
		
		EvenOddNumber num = new EvenOddNumber();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int var = scan.nextInt();
		
		boolean result = num.findEvenOrOdd(var);
		
		if(result == true) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		
	}

}
