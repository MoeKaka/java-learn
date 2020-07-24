package com.java;

public class MainApp {
	
	public static void main(String[] args) {
		
		String str = "Hello from \"Romania\"\n\nHello from \\\\Germany\\\\\\";
		System.out.println(str);

		String s1 = "Ahmad";
		String s2 = " ";
		String s3 = "Muhammad";
		String s4 = s1 + s2 + s3;
		System.out.println(s4);

		char c1 = 'a';
		char c2 = ' ';
		char c3 = '\\';
		char c4 = '6';
		int x = 0;
		double y = 0;

		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.println(c4);

		System.out.println("--------------------------------------------");

		int String = 3;

		System.out.println(String);

		System.out.println("--------------------------------------------");

		System.out.println("Hello " + "From " + "\n" + "AUH ");
		System.out.println("--------------------------------------------");
		int a = 3;
		int b = 6;
		s1 = "a + b = ";
		
		System.out.println("a + b = " + (a + b) ); // "a + b = " + 9
		
		System.out.println("--------------------------------------------");
		
		System.out.println(" " + (3 + 5 * 2 + 7 * 4 / 2)); // "" + 3 + 10 + 14
		
		System.out.println("--------------------------------------------");

		x = 3;
		System.out.println(x);
		x = 5;
		System.out.println(x);
		x = x + 2;
		System.out.println(x);
		x = x*x;
		System.out.println(x);
		x = x + 1;
		System.out.println(x); // 50
		x++; // postincrement ++
		System.out.println(x); // 51
		++x; // preincrement ++
		System.out.println(x); // 52
		x = 52;
		System.out.println("Using postincrement: ");
		System.out.println(x++); //
		System.out.println(x); // 53
		System.out.println("Using preincrement: ");
		System.out.println(++x);
		System.out.println(x);
		--x; // postdecrement
		x--; // predecrement
	}
}
