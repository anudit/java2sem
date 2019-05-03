
public class Objective2 {
	public static void main(String args[]) {
		int red[][] = {
						{3,15,54,16}, 
						{54,23,21,75},
						{0,3,51,0},
						{23,0,43,98}
					};
		int infra[][] = {
				{15,19,66,58}, 
				{13,87,11,13},
				{0,19,86,95},
				{3,0,57,99}
			};
		
		for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
            	try {
            		System.out.print( ((infra[i][j]-red[i][j])/(infra[i][j]+red[i][j])) + " "); 
        		}
        		catch(ArithmeticException ex) {
        			System.out.println("0 ");
        		}
            } 
            System.out.println(); 
        }
		
	}
	
}
