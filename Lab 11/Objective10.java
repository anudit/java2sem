package lab11;

public class Objective10 {
	public static void com(int[] arr1, int[] arr2, int sum) {
		for(int i=0;i<arr1.length;i++)
	        for(int j=0;j<arr2.length;j++)
	            if((arr1[i]+arr2[j]) == sum) {
	            	System.out.println(arr1[i] + " + " + arr2[j]);
	            }
	                
	}
	
	public static void main(String args[]) {
		int[] arr1 = {2, 7, 4, -5, 11, 5, 20};
	    int[] arr2 = {14, -15, 9, 16, 25, 45, 12, 8};  
	    int sum = 50;
	    com(arr1, arr2, sum);
	}
}
