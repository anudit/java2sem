package lab2;

import java.util.Scanner;
import Math;

public class Question10 {
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int week= 2;
		switch(week){
		        case 1:
		        case 2:
		        case 3:
		        case 4:
		        case 5:
		            System.out.println("Weekday");
		            break;
		        case 6:
		        case 7:
		            System.out.println("Weekend");
		            break;
		        default:
		            System.out.println("Invalid week");
		            break;
		    }
	}

}