package lab4;

import java.util.Scanner;
import Math;

public class Question1while {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n=5;
		int i=n;
		while (i>0){
		    int t = 1;
		    while (t<=i){
		        System.out.print(t);
		        t++;
		    }
		    System.out.println("");
		    i-=1;
		}
	}

}