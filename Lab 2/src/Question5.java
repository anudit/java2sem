package lab2;

import java.util.Scanner;
import Math;

public class Question5 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		float a=1;
		if (a >= 0)
		    System.out.println("Number is Positive");
		else
		    System.out.println("Number is Negative");
		
		if (a > 10000)
		    System.out.println("Number is large");
		else if (a <= 1)
		    System.out.println("Number is small");
	}

}