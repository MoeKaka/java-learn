package com.java;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		int x, y, z;
		
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		x = input.nextInt();
		System.out.println("Enter second number: ");
		y = input.nextInt(); // object.method()
		
		
		z = x + y;
		System.out.print("Result is ");
		System.out.println(z);
		
		
		/// entering strings
		String firstName, secondName, fatherName;
		System.out.print("Enter your first name: ");
		firstName = input.next();
		System.out.print("Enter your second name: ");
		secondName = input.next();
		System.out.print("Enter your father name: ");
		fatherName = input.next();
		
		String greeting; 
		greeting = "Hello " + firstName + " " + fatherName + " " + secondName; 
		System.out.println(greeting);
		
	}
}
