package lab9_10;

public class Student {
	int id = 550;
	String name = "";
	char studentType = 'A';
	
	public Student() {
		
	}
	
	public Student(char studentType) {
		setStudentType(studentType);
	}
	
	public Student(char studentType, String fn, String ln) {
		setStudentType(studentType);
		setName(fn+" "+ln);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void displayDetails() {
		System.out.println(this.getId());
		System.out.println(this.getName());
		System.out.println(this.getStudentType());
	}
	public void displayDetails(Student s) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getStudentType());
		
	}
	
	
}
