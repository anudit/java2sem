package lab8;

import java.util.Scanner;

public class Objective11 {
	public static void rep(String st1, String st2) {
		System.out.println(st1);
		System.out.println(st2);
		
		st1.replace(st1,st2);
		
		System.out.println(st1);
		System.out.println(st2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String inp1 = sc.nextLine();
		System.out.println("Enter String2 : ");
		String inp2 = sc.nextLine();
		rep(inp1, inp2);
	}
}

/* 
OUTPUT 

Enter String1 : 
www.bennett.com
Enter String2 : 
Hello World
www.bennett.com
Hello World
Hello World
Hello World

*/