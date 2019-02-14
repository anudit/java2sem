package lab9_10;

public class Student {
	int id = 0;
	String name = "";
	char studentType = 'A';
	
	public Student() {
		
	}
	
	public Student(char studentType) {
		setStudentType(studentType);
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
	
	
}
