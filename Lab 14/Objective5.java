class Cars { 
	
	int NC;
	
	public Cars() {
		NC = 0;
	}
	public void printValue() {
		System.out.println(NC);
	}
	public void setValue(int a) {
		NC = a;
	}
} 

class SSC extends Cars { 
	public SSC(){
		setValue(300);
	}
} 

class CCX extends Cars { 
	public CCX(){
		setValue(400);
	}
} 
public class Objective5 {
	public static void main(String[] args) { 
		SSC obj1 = new SSC();
		CCX obj2 = new CCX();
		obj1.printValue();
		obj2.printValue();
    } 
}
