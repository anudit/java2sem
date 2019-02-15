package lab9_10;

import java.util.Scanner;

public class Assignment13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name : ");
		String inp1 = sc.nextLine();
		System.out.println("Hi " + inp1);
		System.out.println(inp1.toLowerCase());
		System.out.println(inp1.toUpperCase());
		System.out.println(inp1.charAt(0) == 'a');
	}
	
}


