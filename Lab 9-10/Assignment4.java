package lab9_10;

public class Assignment4 {
	public static void main(String args[]) {
		 boolean bool = true;
		 for (int i = 0; i < 5; i++) {
		  for (int j = 0; j < 10; j++) {
		   System.out.print(j + "\t");
		   if (j > 5) {
		    break;
		   }
		  }
		  System.out.println("Outer Loop");
		 }
		 System.out.println("End");
		 
		 System.out.print("\n\n");
		 
		 bool = true;
		 for (int i = 0; i < 5; i++) {
		  for (int j = 0; j < 10; j++) {
		   System.out.print(j + "\t");
		   if (j > 5) {
		    System.out.println();
		    continue;
		   }
		  }
		  System.out.println("Outer Loop");
		 }
		 System.out.println("End");
		 
		}
}
