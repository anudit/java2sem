package lab3;

import java.util.Scanner;
import Math;

public class Question2 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int c=0,a,temp;
		int n=153;
		temp=n;
		while(n>0){
		    a=n%10;
		    n=n/10;
		    c=c+1;
		}
		n = temp;
		int sum = 0 ;
		while(n>0){
		    sum += Math.pow((n%10), c);
		    n=n/10;
		}
		if(temp == sum)
		    System.out.println("Armstrong Number");
		else
		    System.out.println("Not a Armstrong Number");
	}

}