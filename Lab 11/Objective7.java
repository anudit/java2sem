package lab11;

import java.util.Arrays;

public class Objective7 {

	static void reverse(int a[]) { 
        int i, k, t; 
        int n = a.length;
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
        System.out.println(Arrays.toString(a));
 
    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    } 

}
