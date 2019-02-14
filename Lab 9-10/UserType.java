package lab9_10;

public class UserType {
	String name;
	
	UserType(){
		name = "Student";
	}
	
	UserType(String parameterVal) {
		name = parameterVal;
		}
	
	public static void main(String args[]) {
		UserType usertype1 = new UserType("Faculty");
		UserType usertype2 = new UserType();
		System.out.println(usertype1.name);
		System.out.println(usertype2.name);
		}
	}