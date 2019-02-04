package Lab7;

import Lab7.StringUtils;

public class Test {

	private static StringUtils su = new StringUtils();;

	public static void main(String[] args) {

		su.p("Enter A : ");
		int a = su.inpInt();
		su.p("Enter B : ");
		int b = su.inpInt();		
		Calculator calc = new Calculator(a, b);
		calc.add();
		calc.divide();
		calc.subtract();
		calc.multiply();
	}

}
