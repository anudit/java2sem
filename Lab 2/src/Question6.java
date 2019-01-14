package lab2;

import java.util.Scanner;
import Math;

public class Question6 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int a=1, b=5, c=1;
		
		Double d = Math.pow(b, 2)  - 4*a*c;
		if(d < 0)
		    System.out.println("Complex Roots");
		else if(d == 0){
		    double r1 = -b / 2*a ;
		    System.out.println(r1);
		}
		else {
		    double r1 = -b + ( Math.pow(d, 0.5) ) / 2*a ;
		    double r2 = -b - ( Math.pow(d, 0.5) ) / 2*a ;
		    System.out.println(r1);
		    System.out.println(r2);
		}
	}

}