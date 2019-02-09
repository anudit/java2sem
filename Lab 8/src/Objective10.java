package lab8;

import java.util.Scanner;

public class Objective10 {
	public static String subs(String str, int st, int end) { 	       
		return str.substring(st, end);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inp = sc.nextLine();
		System.out.println("Enter Starting Index : ");
		int start = sc.nextInt();
		System.out.println("Enter Ending Index : ");
		int end = sc.nextInt();
		System.out.println(subs(inp, start+1, end+1));
	}
}

/*
OUTPUT

Enter String : 
www.bennett.com
Enter Starting Index : 
2
Enter Ending Index : 
6
.ben
*/

