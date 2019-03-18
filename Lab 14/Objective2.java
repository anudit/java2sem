class Geometry { 
	
	int l;
	public Geometry() {
		l=10;
	}
	public int getl() {
		return l;
	}
	void area() {};
	void perimeter() {};
} 

class Circle extends Geometry { 
    @Override
    void area() { System.out.println(Math.PI * (getl()^2)); } 
    @Override
    void perimeter() { System.out.println(2 * Math.PI * getl()); } 
} 

class Square extends Geometry { 
    @Override
    void area() { System.out.println(getl()^2); } 
    @Override
    void perimeter() { System.out.println(4 * getl()); } 
}

class Rectangle extends Geometry { 
	int b=10;
    @Override
    void area() { System.out.println(getl()*b); } 
    @Override
    void perimeter() { System.out.println(4 *(getl()+b)); } 
} 
  
public class Objective2 { 
    public static void main(String[] args) { 
    	Circle obj1 = new Circle(); 
        obj1.area(); 
        obj1.perimeter(); 
        Square obj2 = new Square(); 
        obj2.area(); 
        obj2.perimeter(); 
        Rectangle obj3 = new Rectangle(); 
        obj3.area(); 
        obj3.perimeter(); 
    } 
} 