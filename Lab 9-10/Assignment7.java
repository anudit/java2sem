package lab9_10;

public class Assignment7 {
	public static void main (String args[]) {
		Student st1 = new Student('S');
		st1.setId(101);
		st1.setName("Name1");
		Student st2 = new Student('F');
		st2.setId(102);
		st2.setName("Name2");
		CourseManagement cm = new CourseManagement();
		cm.addStudent(st1);
		cm.addStudent(st2);
		System.out.println(cm.getStudent(0).getId()  + " : "+ cm.getStudent(0).getName() + " : "+ cm.getStudent(0).getStudentType() );
		System.out.println(cm.getStudent(1).getId()  + " : "+ cm.getStudent(1).getName() + " : "+ cm.getStudent(1).getStudentType() );
	}
}
