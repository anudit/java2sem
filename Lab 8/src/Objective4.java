package lab8;

import java.util.Scanner;

public class Objective4 {
	
	public static char lastCh(String str) {
		return str.charAt(str.length()-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		System.out.println(lastCh(inp));
	}
}
/* 
OUTPUT 

Enter String : 
hello world
d

*/