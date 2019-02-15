package lab9_10;

class Customer2 { 
	 static { 
	  noOfCustomers = 50;
	 } 
	 private int customerId;
	 private String customerName;
	 private int customerTelNo;
	 private String customerEmail; /* declaration of static variables (class variables )* this is common for all the objects created */
	 static int noOfCustomers; /** * Parameterized Constructor: Creates a customer Object and* initializes the instances variables with the supplied values.* Since the method arguments name and instance variable names* are similar we have to use this keyword which has a* reference to the current object*/
	 
	 public Customer2(int customerId, String customerName, int customerTelNo, String customerEmail) {
	  this.customerId = customerId;
	  this.customerName = customerName;
	  this.customerTelNo = customerTelNo;
	  this.customerEmail = customerEmail; 
	  noOfCustomers++;
	 } 
	 public void displayCustomer() {
	  System.out.println("Customer Id:" + customerId);
	  System.out.println("Customer Name :" + customerName);
	  System.out.println("Customer TelNo : " + customerTelNo);
	  System.out.println("Customer Email Id : " + customerEmail);
	 }
	 public static void customerCount() {
	  System.out.println("No of Customers : " + noOfCustomers);
	 } 
	 public static void main(String argv[]) {
		 Customer2 c1=new Customer2(1001, "John", 465364,  "John@yahoo.com");
		 Customer2 c2=new Customer2(1002, "Jack", 764755, "Jack@yahoo.com");
		 Customer2.customerCount();// 
		 c2.displayCustomer(); 
	 }
}
	 