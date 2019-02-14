package lab9_10;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String args[]) {
		
		char grade = 'E';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		int inp1 = sc.nextInt();

		if (inp1 >= 80)
			grade = 'A';
		else if (inp1 >= 73)
			grade = 'B';
		else if (inp1 >= 65)
			grade = 'C';
		else if (inp1 >= 55)
			grade = 'D';
		
		
		System.out.println("Grade : " + grade);
		
	}
		
}
