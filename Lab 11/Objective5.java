package lab11;

public class Objective5 {
	public static int max(int[] arr) {
		int max= -9999;
		for(int i=0; i< arr.length;i++)
			if(arr[i] >=max)
				max = arr[i];
		return max;
	}
	
	public static int min(int[] arr) {
		int min= 9999;
		for(int i=0; i< arr.length;i++)
			if(arr[i] <=min)
				min = arr[i];
		return min;
	}
	
	public static void main(String args[]) {
		int[] arr ={21, 25, 14, 56, 15, 36, 56, 77, 18, 29, 49,100};
		
		System.out.println("Max: " + max(arr));
		System.out.println("Min: " + min(arr));
	}
}
