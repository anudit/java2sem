package lab6;

public class Course {
    private static int studentCount = 100;
    private static int courseId;
    private int studentId; 
    // Static Block
    static {
        // To –Do: Initialize the static variable to 100.
        System.out.println(studentCount);
        System.out.println(courseId);
    }
    Course() {
        studentCount++;
        studentId = studentCount;
    }
    /*** Returns the value of the static variable*/
    public static int getStudentCount(){
        return studentCount;
    }
    /*** Returns the value of courseId*/
    public int getCourseId() {
       return courseId;
    }
    /*** Sets the value of courseId*/
    public void setCourseId(int courseId){
       this.courseId = courseId;
    }
    /*** Returns the value of studentId*/
    public int getStudentId() {
        return studentId;
    }
}