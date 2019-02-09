package lab8;

import java.util.Scanner;

public class Objective8 {
	public static String revWords(String str) {
		StringBuilder result = new StringBuilder(str.length());
		String words[] = str.split("\\ "); 
		for (int i = 0; i < words.length; i++){	
			StringBuilder str2 = new StringBuilder(); 
	        str2.append(words[i]); 
	        str2 = str2.reverse(); 
			result.append(str2).append(" ");
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		System.out.println(revWords(inp));
	}
}
/*
OUTPUT

Enter String : 
Hello World
olleH dlroW 
*/

