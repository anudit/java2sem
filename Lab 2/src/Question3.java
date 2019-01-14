package lab2;

import java.util.Scanner;
import Math;

public class Question3 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int a=10, b=1, c=2;
		if (a >= b && a >= c)
		    System.out.println("A is greatest");
		else if(b >= a && b >= c)
		    System.out.println("B is greatest");
		else 
		    System.out.println("C is greatest");
	}

}