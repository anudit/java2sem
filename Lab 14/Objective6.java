class Calculator { 
	
	int num;
	
	public Calculator() {
		num = 2;
	}
	public void printValue() {
		System.out.println(num);
	}
	public void setValue(int a) {
		num = a;
	}
} 

class Sq extends Calculator { 
	public Sq(){
		System.out.println(num*num);
	}
} 

class Cube extends Calculator { 
	public Cube(){
		System.out.println(num*num*num);
	}
} 
public class Objective6 {
	public static void main(String[] args) { 
		Sq obj1 = new Sq();
		Cube obj2 = new Cube();
    } 
}
