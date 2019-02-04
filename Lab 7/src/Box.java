package Lab7;

import Lab7.StringUtils;

public class Box {
	
	private double penA;
	private double penB;
	private double penC;
	private int yrs;

	private static StringUtils su = new StringUtils();
	
	Box(){
		penA = 25;
		penB = 35;
		penC = 40;
		yrs = 0;
	}
	
	public void setYrs(int y){
		yrs = y;
	}

	public void printPricesA(int y){
		setYrs(y);
		y-=1991;
		double tempPrice1 = penA;
		double tempPrice2 = penA;
		for (double i=0;i<=y;i++){
			tempPrice1 += tempPrice1*0.08;
			tempPrice2 += tempPrice2*0.12;
		}
		su.p("Cost Price of PEN A in " + yrs + " : "+ tempPrice1);
		su.p("Selling Price of PEN A in " + yrs + " : "+ tempPrice2);
	} 

	public void printPricesB(int y){
		setYrs(y);
		y-=1991;
		double tempPrice1 = penB;
		double tempPrice2 = penB;
		for (double i=0;i<=y;i++){
			tempPrice1 += tempPrice1*0.08;
			tempPrice2 += tempPrice2*0.12;
		}
		su.p("Cost Price of PEN B in " + yrs + " : "+ tempPrice1);
		su.p("Selling Price of PEN B in " + yrs + " : "+ tempPrice2);
	} 

	public void printPricesC(int y){
		setYrs(y);
		y-=1991;
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
