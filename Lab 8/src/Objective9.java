package lab8;

import java.util.Scanner;

public class Objective9 {
	public static void st(String str) { 	       
		System.out.println("Lower Case String: " + str.toLowerCase());
		System.out.println("Upper Case String: " + str.toUpperCase());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		st(inp);
	}
}
/*
OUTPUT

Enter String : 
Hello World
olleH dlroW 
*/
