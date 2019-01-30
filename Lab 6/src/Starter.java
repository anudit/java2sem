package lab6;

import lab6.EmployeeGrade;
import lab6.EmployeeInformation;

public class Starter {

    public static void main (String[] args) {
            EmployeeGrade emp = new EmployeeGrade();
            emp.calculateAverageFeedback();
            emp.calculateGrade();
            emp.displayInfo();

            System.out.println("\n");
            
            EmployeeInformation emp1 = new EmployeeInformation();
            emp1.displayInfo();
    }
}