package Lab7;

import java.util.Scanner; 

public class StringUtils {

	Scanner sc;

	StringUtils(){
		sc = new Scanner(System.in);
	}

	public void p(String st) {
		System.out.println(st);
	}
	
	public int inpInt() {
		return sc.nextInt();
	}
	
	public String inpLn() {
		return sc.nextLine();
	}
}
