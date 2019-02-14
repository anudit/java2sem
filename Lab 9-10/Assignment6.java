package lab9_10;

import lab9_10.Student;
import lab9_10.CourseManagement;;

public class Assignment6 {
	public static void main (String args[]) {
		Student st1 = new Student();
		st1.setId(101);
		st1.setName("Name1");
		CourseManagement cm = new CourseManagement();
		cm.addStudent(st1);
		System.out.println(cm.getStudent(0).getId()  + " : "+ cm.getStudent(0).getName() );
	}
}
