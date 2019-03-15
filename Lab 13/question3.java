package lab11e;

import java.util.Arrays;
import java.util.Scanner;

public class question3	 {
	public static void pat(int arr[][]) {
		
		System.out.println("Rows : " + arr.length);
		System.out.println("Columns : " + arr[0].length);
	}
	
	public static void main(String args[]) {
		int arr[][] = new int[20][5];
		pat(arr);
	}
}
