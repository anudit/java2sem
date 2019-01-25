package Lab5;

import java.io.InputStream;
import java.util.Scanner;

import Lab5.UserInput;

public class Question1 {

	public static void main(String[] args) {
		int userPreference;
		Scanner sc= new Scanner(System.in);
		UserInput userInput = new UserInput();
		System.out.println("Enter the first number");
		userInput.setNumber1(sc.nextInt());
		System.out.println("Enter the second number");
		userInput.setNumber2(sc.nextInt());
		System.out.println("Press 1 to display addition," + " 2 to display multiplication and " + "3 to display the numbers");
		userPreference = sc.nextInt();
		if (userPreference == 1) {
			int add;
			int num1,
			num2;
			num1 = userInput.getNumber1();
			num2 = userInput.getNumber2();
			add = userInput.addition(Math.abs(num1), Math.abs(num2));
			System.out.println("Addition of 2 numbers is " + add);
		} else if (userPreference == 2) {
			int multi;
			int num1,
			num2;
			num1 = userInput.getNumber1();
			num2 = userInput.getNumber2();
			multi = userInput.multiplication(Math.abs(num1), Math.abs(num2));
			System.out.println("Multiplication of 2 numbers is " + multi);
		} else if (userPreference == 3) {
			System.out.println("Numer 1 is " + userInput.getNumber1());
			System.out.println("Numer 2 is " + userInput.getNumber2());
			System.out.println("Have a nice day.... Bye");
		}
		sc.close();
	}
	
}

