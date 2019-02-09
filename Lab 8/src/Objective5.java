package lab8;

import java.util.Scanner;

public class Objective5 {
	
	public static String merge(String st1, String st2) {
		return st1 + st2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String inp1 = sc.nextLine();
		System.out.println("Enter String2 : ");
		String inp2 = sc.nextLine();
		System.out.println(merge(inp1, inp2));
	}
}
/* 
OUTPUT 

Enter String1 : 
hello
Enter String2 : 
world
helloworld

*/