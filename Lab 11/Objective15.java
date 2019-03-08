package lab11;

import java.util.Arrays;

public class Objective15 {
	static int sortRowWise(int m[][]) { 
        for (int i = 0; i < m.length; i++) 
            Arrays.sort(m[i]); 

        for (int i = 0; i < m.length; i++) { 
            for (int j = 0; j < m[i].length; j++) 
                System.out.print(m[i][j] + " "); 
            System.out.println(); 
        } 
        return 0; 
    } 

    public static void main(String args[]) { 
        int m[][] = { { 77, 11, 22, 3 }, 
                      { 11, 89, 1, 12 }, 
                      { 32, 11, 56, 7 }, 
                      { 11, 22, 44, 33 } }; 
        sortRowWise(m); 
    }
}
