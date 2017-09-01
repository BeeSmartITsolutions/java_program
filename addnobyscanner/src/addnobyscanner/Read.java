package addnobyscanner;

import java.io.*;
import java.util.Scanner;

class Read {
	public static void main(String s[]){
		int a, b,c;
		
		Scanner x = new Scanner (System.in);
		
		System.out.println("Enter the first number: ");
		a = x.nextInt();
		
		System.out.println("Enter the second number: ");
		b = x.nextInt();
		
		c= a+b;
		
		System.out.print("Sum of two numbers is " +c);
		
	}

}
