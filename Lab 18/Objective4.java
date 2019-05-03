import java.util.Scanner;
public class Objective4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		try {
			for (int i=0;i<5;i++) {
				arr[i] = sc.nextInt();
			}
        }
        catch (Exception e){
            System.out.println("Exception!");
        }
        finally {
        	for (int j = 0; j < 5; j++) {
        		System.out.print(arr[j]+" ");
        	}
        }
        
    }
}
