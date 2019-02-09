package lab8;
import java.util.Scanner;

public class stringmain {
	public static void main(String[] args) {
	    stringmethod stringMethod = new stringmethod();
	    String var1;
	    int index;
	    stringMethod.setVar("Bennett");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the new string");
	    var1 = sc.nextLine();
	    System.out.println("Enter the index for which you need the character");
	    index = sc.nextInt();
	    stringMethod.charAtFunc(var1, index);
	}
}