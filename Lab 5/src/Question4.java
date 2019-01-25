package Lab5;

import java.util.Scanner;

public class Question4 {

	public static int fib() {
		int a = 0;
		int b = 1;
		for (int i=2; i !=15; i++){
			int sum  = a + b;
			a = b;
			b = sum;
		}
		return b;
	}
	
	public static boolean isPrime(int number){
		for(int i=2; i<number; i++){
		if(number%i == 0){
			return false; 
		}
		}
		return true; 
	}

	public static int prime(int lower, int upper){
		int count = 0;
		for(int number = lower; number<=upper; number++){
			if(isPrime(number)){
				// System.out.println(number);
				count++;
			}
		}
		return count;
	}

	public static long fact(int num){
        long factorial = 1;
        for(int i = 1; i <= num; ++i){
            factorial *= i;
        }
		return factorial;
	}

	public static boolean arm(int number){
		int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            return true;
        else
            return false;
	}

	public static void main(String[] args) {
		int userPreference;
		Scanner sc= new Scanner(System.in);

		System.out.println("Press 1 to fib() \n");
		System.out.println("Press 2 to prime()\n");
		System.out.println("Press 3 to fact()\n");
		System.out.println("Press 4 to arm()\n");
		userPreference = sc.nextInt();
		
		if (userPreference == 1) {
			int ans = fib();
			System.out.println("Answer :" + ans);
		} else if (userPreference == 2) {
			System.out.println("Enter lower limit:");
			int l = sc.nextInt();
			System.out.println("Enter upper limit:");
			int u = sc.nextInt();
			int ans = prime(l, u);
			System.out.println("Answer :" + ans);
		} else if (userPreference == 3) {
			System.out.println("Enter Number:");
			int n = sc.nextInt();
			long ans = fact(n);
			System.out.println("Answer :" + ans);
		} else if (userPreference == 4) {
			System.out.println("Enter Number:");
			int n = sc.nextInt();
			System.out.println("Answer :" + arm(n));
		}
		else{
			System.out.println("Invalid Input");
		}

		sc.close();
	}
	
}



