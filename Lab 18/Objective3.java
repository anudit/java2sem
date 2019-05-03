import java.util.Scanner;
public class Objective3 {
	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter first number(numerator): ");
		int numerator = inputDevice.nextInt();
		System.out.print("Please enter second number(denominator): ");
		int denominator = inputDevice.nextInt();		
		new Objective3().doDivide(numerator, denominator);		
	}
	public void doDivide(int a, int b){
		try{
			float result = a/b;
			System.out.println("Division result of "+ a +"/"+b +"= " +result);
		}catch(ArithmeticException e){
			System.out.println("Exception Condition Program is ending ");
		}
	}
}