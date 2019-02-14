package lab9_10;

public class ElectricityBill {
	int customerId;
	String customerName;
	float previousReading;
	float currentReading;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getPreviousReading() {
		return previousReading;
	}
	public void setPreviousReading(float previousReading) {
		this.previousReading = previousReading;
	}
	public float getCurrentReading() {
		return currentReading;
	}
	public void setCurrentReading(float currentReading) {
		this.currentReading = currentReading;
	}
	public void printDetails() {
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		float NoOfUnits = currentReading - previousReading;
		System.out.println("NoOfUnits : " + NoOfUnits);
	}
}
