package lab9_10;

import java.util.List;
import java.util.ArrayList;

import lab9_10.Student;

public class CourseManagement {
	int cid = 0;
	int totalStudents = 0;
	List<Student> studentList = new ArrayList<Student>();
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void addStudent(Student s) {
		studentList.add(s);
		totalStudents+=1;
	}
	
	public Student getStudent(int ind) {
		Student temp = studentList.get(ind);
		return temp;
	}
	
}
