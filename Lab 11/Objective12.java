package lab11;

import java.util.Arrays;

public class Objective12 {
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
		int[] arr ={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(Arrays.toString(arr));	
		arr = rev(arr);
		
		for(int j =1;j<arr.length ;j+=2) {
			int pos=j;
			int num = arr[arr.length-1];
			for(int i = arr.length; i>pos;i--)
				arr[i-1] = arr[i-2]; 
			arr[pos] = num;
		}
		System.out.println(Arrays.toString(arr));		
	}
}
