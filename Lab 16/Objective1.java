import java.util.*; 
import java.lang.*; 
import java.io.*; 

interface one { 
	public void print1(); 
} 

interface two { 
	public void print2(); 
} 

interface three extends one,two { 
	public void print1(); 
} 
class child implements three { 
	@Override
	public void print1() { 
		System.out.println("Hello"); 
	} 

	public void print2() { 
		System.out.println("World"); 
	} 
} 

public class Objective1 { 
	public static void main(String[] args) { 
		child c = new child(); 
		c.print1(); 
		c.print2(); 
	} 
} 

