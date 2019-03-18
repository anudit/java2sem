class IndianUniversity { 
	
	int NumStu;
	int NumProg;
	int NumUni;
	
	public IndianUniversity() {
		NumStu = 0;
		NumProg = 0;
		NumUni = 0;
	}
	public void printValues() {
		System.out.println(NumStu);
		System.out.println(NumProg);
	}
	public void setValues(int a, int b) {
		NumStu = a;
		NumProg = b;
	}
} 

class Bennett extends IndianUniversity { 
	
	public Bennett(){
		NumUni+=1;
		setValues(1200, 7);
	}
} 

class CSE extends Bennett { 
	
	public CSE(){
		setValues(600, 3);
	}
	@Override
	public void printValues() {
		System.out.println("Overriden Print");
		System.out.println(NumStu);
		System.out.println(NumProg);
	}
} 

class SNU extends IndianUniversity { 
	public SNU(){
		NumUni+=1;
		setValues(4000, 4);
	}
} 

class IITB extends IndianUniversity { 
	public IITB(){
		NumUni+=1;
		setValues(10000, 15);
	}
} 

public class Objective4 {
	public static void main(String[] args) { 
		Bennett obj1 = new Bennett();
		SNU obj2 = new SNU();
		IITB obj3 = new IITB();
		CSE obj4 = new CSE();
		obj1.printValues();
		obj2.printValues();
		obj3.printValues();
		obj4.printValues();
    } 
}
