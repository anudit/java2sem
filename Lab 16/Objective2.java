abstract class Shape{
   final int b = 20;
   abstract public void area();
}

class Rectangle extends Shape{
	   public void area() {
		   System.out.println("Rectangle Area:"+ b*b);
	   };
	}

class Triangle extends Shape{
	   public void area() {
		   System.out.println("Triangle Area:"+ 0.5*b*b);
	   };
	}

public class Objective2 {
	public static void main(String args[]){
	      Rectangle rec = new Rectangle();
	      rec.area();
	      Triangle tri = new Triangle();
	      tri.area();
	  }
}
