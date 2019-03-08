package lab11;

import java.util.Arrays;

public class Objective11 {
	
	public static int[] rev(int[] a) {
		for (int i = 0; i < a.length; i++) 
			for (int j = i + 1; j < a.length; j++) 
	        	if (a[i] < a[j]) {
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
		return a;
	}
	
	public static void main(String args[]) {
		int[] arr ={-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rev(arr)));
	}
	
}
