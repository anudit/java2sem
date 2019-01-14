package lab2;

import java.util.Scanner;
import Math;

public class Question13 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int month= 2;
		int y = 2016;
		switch(month){
		        case 1:
		            System.out.println("31");
		            break;
		        case 2:
		            if (y%4== 0)
		                System.out.println("29");
		            else
		                System.out.println("28");
		            break;
		        case 3:
		            System.out.println("31");
		            break;
		        case 4:
		            System.out.println("30");
		            break;
		        case 5:
		            System.out.println("31");
		            break;
		        case 6:
		            System.out.println("30");
		            break;
		        case 7:
		            System.out.println("31");
		            break;
		        case 8:
		            System.out.println("30");
		            break;
		        case 9:
		            System.out.println("31");
		            break;
		        case 10:
		            System.out.println("30");
		            break;
		        case 11:
		            System.out.println("31");
		            break;
		        case 12:
		            System.out.println("30");
		            break;
		        default:
		            System.out.println("31");
		            break;
		    }
	}

}