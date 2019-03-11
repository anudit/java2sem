package lab11e;

import java.util.Arrays;
import java.util.Scanner;

public class question2 {
	public static void pat(int s) {
		
		for(int i=0;i<s;i++) {
			for(int j=0;j<(s-i);j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		int s = sc.nextInt();
		pat(s);
	}
}
