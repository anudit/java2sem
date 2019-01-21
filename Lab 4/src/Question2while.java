package lab4;

import java.util.Scanner;
import Math;

public class Question2while {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String ch="*";
		int n = 5;
		int i=0;
		for(i=n; i>0; i--){
		    System.out.println("");
		    for(int t=1; t<=i;t++){
		        System.out.print(ch);
		    }   
		}
		for(i=0; i<=n; i++){
		    for(int t=1; t<=i;t++){
		        System.out.print(ch);
		    }
		    System.out.println("");
		}
	}

}