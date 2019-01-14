package lab2;

import java.util.Scanner;
import Math;

public class Question7 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int a = 80;
		int b = 68;
		int c = 90;
		int mean = a+b+c/3;
		if (mean >= 90){
		    System.out.println("A");
		}
		else if (mean >= 70){
		    System.out.println("b");
		}    
		else if (mean >= 50){
		    System.out.println("C");
		} 
		else {
		    System.out.println("F");
		} 

	}

}