package lab11;

import java.util.Arrays;

public class Objective4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={21, 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println(Arrays.toString(array));
		int num = 5;
		int pos = 4;
		for(int i=array.length; i>pos;i--) {
			array[i-1] = array[i-2]; 
		}
		array[pos] = num;
		System.out.println(Arrays.toString(array));
	}

}
