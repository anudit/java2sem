package lab8;

import java.util.Scanner;

public class Objective2 {
	
	public static void getSub(String st) {
		int l = st.length();
		for(int i = 0 ; i < l; i++) {
			for(int j = i ; j <= l; j++) {
				System.out.println(st.substring(i,j));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		getSub(inp);
	}
	
}
/*

Enter String : 
shore
s
sh
sho
shor
shore
h
ho
hor
hore
o
or
ore
r
re
e
*/