package lab8;

import java.util.Scanner;

public class Objective1 {
	
	public static int getLen(String st) {
		int len = st.length();
		return len;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		int l = getLen(inp);
		System.out.println(l);
	}
	
}

/*
 * Enter String : 
 * hello
 * 5
 */
