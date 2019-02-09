package lab8;

import java.util.Scanner;

public class Objective12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String inp1 = sc.nextLine();
		System.out.println(inp1);
		System.out.println(inp1.trim());   
	}
}

/* 
OUTPUT 

Enter String1 : 
   www.bennett.com    
   www.bennett.com    
www.bennett.com

*/