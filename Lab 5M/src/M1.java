package lab5M;

public class M1 {
	
	public static void main(String args[])
	   {
	      int x, y, temp;
	      
	      System.out.println("Enter x and y");
	     
	      x = 5;
	      y = 10;
	     
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	     
	      temp = x;
	      x = y;
	      y = temp;
	     
	      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	   }
}
