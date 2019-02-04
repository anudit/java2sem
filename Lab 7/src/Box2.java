package Lab7;

import Lab7.StringUtils;

public class Box2 {
    
    private static StringUtils su = new StringUtils();

    static {

        double penA = 25;
		double penB = 35;
		double penC = 40;

        for (int cnt=1991; cnt <= 1999; cnt ++){
			printPricesA(penA, cnt);
            printPricesB(penB, cnt);
            printPricesC(penC, cnt);
			su.p("\n");
		}	
		
    }

	public static void printPricesA(double penA, int yrs){
        int y = yrs - 1991;
		double tempPrice1 = penA;
		double tempPrice2 = penA;
		for (double i=0;i<=y;i++){
			tempPrice1 += tempPrice1*0.08;
			tempPrice2 += tempPrice2*0.12;
		}
		su.p("Cost Price of PEN A in " + yrs + " : "+ tempPrice1);
		su.p("Selling Price of PEN A in " + yrs + " : "+ tempPrice2);
	} 

	public static void printPricesB(double penB, int yrs){
		int y = yrs - 1991;
		double tempPrice1 = penB;
		double tempPrice2 = penB;
		for (double i=0;i<=y;i++){
			tempPrice1 += tempPrice1*0.08;
			tempPrice2 += tempPrice2*0.12;
		}
		su.p("Cost Price of PEN B in " + yrs + " : "+ tempPrice1);
		su.p("Selling Price of PEN B in " + yrs + " : "+ tempPrice2);
	} 

	public static void printPricesC(double penC, int yrs){
		// setYrs(y);
		int y = yrs - 1991;
		double tempPrice1 = penC;
		double tempPrice2 = penC;
		for (double i=0;i<=y;i++){
			tempPrice1 += tempPrice1*0.08;
			tempPrice2 += tempPrice2*0.12;
		}
		su.p("Cost Price of PEN C in " + yrs + " : "+ tempPrice1);
		su.p("Selling Price of PEN C in " + yrs + " : "+ tempPrice2);
	} 

}
