package Day_13_Inheritance;

class A {
	
	int age = 30;
	String dob = "09/23/90";
	double salary = 27570;
	
	
	public void msg() {
		System.out.println(" This message comes from Class A!");
	}
	public void methodA() {
		System.out.println(" This Line comes from method A");
	}
}

class B extends A {
	
	String address = " what ever, somewhere parkway";
	String startDate = "09/20/1968";
	boolean right = true;
	
	public void text() {
		System.out.println(" This Text comes from Class B!!");
	}
	public void methodB() {
		System.out.println(" This is coming from methodB");
	}
}



public class MultiLevel extends B {
	
	int grade = 25;
	double size = 25.6;

	public static void main(String[] args) {
		MultiLevel obj = new MultiLevel();
		
		
		System.out.println(obj.age + obj.salary + obj.startDate);
        obj.text();
        obj.msg();
        obj.methodB();
        obj.methodA();
        System.out.println(obj.address);
        
        
	}

}
