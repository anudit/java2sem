package lab6;

public class EmployeeGrade {

	int employeeNo;
	String employeeName;
	float customer1Feebdack;
	float customer2Feedback;
	float customer3Feedback;
	float averageFeedback;
	char grade;

	public void calculateAverageFeedback(){
		averageFeedback = (customer1Feebdack + customer2Feedback + customer3Feedback) / 3;
	}
	public void calculateGrade(){
		grade = 'A';
	}
	public void displayInfo(){
		System.out.println(averageFeedback);
		System.out.println(grade);
	}
	
	public EmployeeGrade() {
		employeeNo = 101;
		employeeName = "Ram";
		customer1Feebdack = 4.1f;
		customer2Feedback = 4.0f;
		customer3Feedback = 4.3f;
	}
}
