package lab3;

import java.util.Scanner;
import Math;

public class Question1 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int c=0,a,temp;
		int n=153;//Itisthenumbertocheckarmstrong
		temp=n;
		while(n>0){
		    a=n%10;
		    n=n/10;
		    c=c+1;
		}
		System.out.println("Number of digits in given number is : " + c);
	}

}