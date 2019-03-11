package lab11e;

import java.util.Arrays;

public class question7 {
	
	public static Boolean check(int arr[]) {
		int flag=0;
		for(int i=1;i<(arr.length);i++)
			if(arr[i]%2 == 0 && arr[i] < 0) {
				return false;
			}
		for(int i=1;i<(arr.length);i++)
			if(arr[i]%2 != 0 && arr[i] > 0) {
				flag = 1;
				return false;
			}	
		return true;
	}
	
	public static void main(String args[]) {
		int arr[] = {0,-1,0,-0,1,0,1,0,2,-0,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(check(arr));
		
	}
}
