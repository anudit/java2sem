package lab11;

public class Objective9 {
	
	public static void com(int[] arr1, int[] arr2) {
		for(int i=0;i<arr1.length;i++)
	        for(int j=0;j<arr2.length;j++)
	            if(arr1[i]==arr2[j])
	                System.out.println(arr1[i]);
	}
	
	public static void main(String args[]) {
		int[] arr1 = {1, 0, 6, 15, 6, 4, 7, 0, 9};
	    int[] arr2 = {1, 2, 5, 5, 8, 9, 7, 10,15};   
	    com(arr1, arr2);
	}
}
