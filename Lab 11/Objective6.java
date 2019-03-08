package lab11;

public class Objective6 {

	public static void dup(int[] arr) {
		int s= 0;
		for(int i=0; i< arr.length;i++) {
			int ele = arr[i];
			for(int j=i+1;j<arr.length;j++)
				if(arr[j] == ele) {
					System.out.println("Duplicate Element: " + ele);
					break;
				}
		}
	}
	
	public static void main(String args[]) {
		int[] arr ={1, 2, 5, 5, 6, 6, 7, 2, 9, 10};
		dup(arr);
	}

}
