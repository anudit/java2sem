package lab11;

import java.util.Arrays;

public class Objective14 {
	
    static int[] rot(int[] arra){
       int a = arra[arra.length-1], i;
       for (i = arra.length-1; i > 0; i--)
          arra[i] = arra[i-1];
       arra[0] = a;
       return arra;
    }
     
   public static void main(String[] args) 
    {
	   int arr[] = new int[]{10, 20, 30, 40, 50, 60};
	   System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rot(arr)));
    }
}
