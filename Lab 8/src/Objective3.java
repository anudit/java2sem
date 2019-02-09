package lab8;

import java.util.Scanner;

public class Objective3 {
	
	public static String toTitleCase(String str) {
		StringBuilder result = new StringBuilder(str.length());
		String words[] = str.split("\\ "); 
		for (int i = 0; i < words.length; i++){			
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		System.out.println(toTitleCase(inp));
	}
}
/* 
OUTPUT 

Enter String : 
hello world
Hello World 
*/