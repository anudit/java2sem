package lab8;

import java.util.Scanner;

public class Objective14 {
	public static int freq(String str, char ch) {
        int frequency = 0;
        for(int i = 0; i < str.length(); i++)
        	if(ch == str.charAt(i))
        		++frequency;
        return frequency;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		for (int i = 65;i<=122;i++)
			if(freq(inp, (char)i) > 1)
				System.out.println("The character " + (char)i + " is repeated");
	}
}
