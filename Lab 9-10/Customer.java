package lab9_10;

class Customer{
	private int customerId;
	private String customerName;
	Customer(int customerId, String customerName){
		this.customerId= customerId;
		this.customerName= customerName;
	}
	public void displayCustomer(){
		System.out.println("Customer Id  :" + customerId);
		System.out.println("Customer Name :" + customerName);
	}
	public static void main(String argv[]){
		Customer c1=new Customer(1001, "John");
		c1.displayCustomer();
	}
}