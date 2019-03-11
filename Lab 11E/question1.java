package lab11e;

import java.util.Arrays;
import java.util.Scanner;

public class question1 {
	
	public static char[] pal(char word[]) {
		char pal[] = new char[9];
		
		for(int i=0;i<word.length;i++)
	        pal[i] = word[i];
		
		int pos = 5;
		for(int i=(word.length-2);i>=0;i--) {
			pal[pos] = word[i];
			pos++;
		}
	    return pal;
	}
	
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		char word[] = new char[5];
		for(int i =0; i<word.length;i++) {
			word[i] = sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(word));
		System.out.println(Arrays.toString(pal(word)));
	}
}
