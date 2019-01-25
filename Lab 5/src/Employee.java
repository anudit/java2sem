package Lab5;

import java.io.InputStream;
import java.util.Scanner;

public class Employee {

	String id;
	String fn;
    String ln;
    String email;
    String num;
    String add;
    int sal;
    String gen;
    String jd;
    String dob;

	public Employee(String id, String fn, String ln, String email, String num, String add, int sal, String gen, String jd, String dob) {
		this.id = id;
        this.fn = fn;
        this.ln = ln;
        this.email = email;
        this.num = num;
        this.add = add;
        this.sal = sal;
        this.gen = gen;
        this.jd = jd;
        this.dob = dob;
        
	}

	public void print(){

        System.out.println(id);
        System.out.println(fn);
        System.out.println(ln);
        System.out.println(email);
        System.out.println(num);
        System.out.println(add);
        System.out.println(age);
        System.out.println(gen);
        System.out.println(jd);
        System.out.println(dob);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        System.out.println("Enter Employee ID : ");
		String id = sc.nextLine();
        System.out.println("Enter First Name : ");
		String fn = sc.nextLine();
        System.out.println("Enter Last Name : ");
		String ln = sc.nextLine();
        System.out.println("Enter Email : ");
		String email = sc.nextLine();
        System.out.println("Enter Phone Number : ");
		String num = sc.nextLine();
        System.out.println("Enter Address : ");
        String add = sc.nextLine();
        System.out.println("Enter Salary : ");
        int sal = sc.nextInt();
        System.out.println("Enter Gender : ");
        String gen = sc.nextLine();
        System.out.println("Enter Joining Date : ");
        String jd = sc.nextLine();
        System.out.println("Enter DOB : ");
        String dob = sc.nextLine();

		Employee emp= new Employee(id, fn, ln, email, num, add, sal, gen, jd, dob);
		emp.print();

        sc.close();
	
	}
	
}

