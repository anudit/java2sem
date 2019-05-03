public class Objective1 {
	public static void main(String[] args) {
        try {
            int arr[] = {
                4,
                4,
                5
            };
            arr[6] = 90;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Index out of bound");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Index out of bound");
        } 
    }
}