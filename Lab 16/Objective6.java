import java.util.*; 
import java.lang.*; 
import java.io.*; 

class A { 
	int a =1;
	public void p() {
		System.out.println("Call from Class A:"+a);
	}
} 

class B extends A{} 
class C extends B{} 
class D extends B{} 

public class Objective6 { 
	public static void main(String[] args) { 
		
	} 
} 

