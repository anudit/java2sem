package lab6;

public class EmployeeInformation {

	int employeeNo;
	String name;

	public void displayInfo(){
		System.out.println(employeeNo);
		System.out.println(name);
	}
	
	public EmployeeInformation() {
		employeeNo = 101;
		name = "Ram";
	}

    public EmployeeInformation(String n) {
		employeeNo = 101;
		name = n;
	}
}
