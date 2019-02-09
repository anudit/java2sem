package lab8;

import java.util.Scanner;

public class Objective7 {

	public static boolean pal(String str) {        
        StringBuilder str2 = new StringBuilder(); 
        str2.append(str); 
        str2 = str2.reverse(); 
        if(str2.toString() == str)
        	return true;
        else
        	return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		System.out.println(pal(inp));
	}
}
/*
OUTPUT

Enter String : 
lool
true
*/
