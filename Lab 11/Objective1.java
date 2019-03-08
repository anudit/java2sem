package lab11;

public class Objective1 {

	public static int sum(int[] arr) {
		int s= 0;
		for(int i=0; i< arr.length;i++) {
			s+=arr[i];
		}
		return s;
	}
	
	public static void main(String args[]) {
		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The sum is " + sum(arr));
	}
}