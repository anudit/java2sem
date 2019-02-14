package lab9_10;

import lab9_10.ElectricityBill;

public class Assignment9 {
	
	public static void main(String args[]) {
		ElectricityBill eb = new ElectricityBill();
		eb.setCustomerId(101);
		eb.setPreviousReading(108);
		eb.setCurrentReading(109);
		eb.setCustomerName("Name");
		eb.printDetails();
	}
	

}
