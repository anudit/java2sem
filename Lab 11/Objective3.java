package lab11;

public class Objective3 {
	public static void main(String args[]) {
		int[] array ={14,25,14,56,15,36,56,77,18,29,49};
		int num = 14;
		for(int i=0; i< array.length;i++) {
			if(array[i]==num)
				System.out.println("Index position of "+num+ " is: " + i+1);
		}
		
	}
}
