package Polymorphism;

public class MethodOverload {
	//method overloading by changing the number of arguments
	
	
	
	
	void sum (int a, int b) {
		System.out.println(" The value of two numbers is "+(a+b));
	}
	void sum(int a, int b, int c) {
		System.out.println("The value of three numbers is "+(a+b+c));
	}
	
	//Method overloading by changing the Data type
	
	void sub(int a, int b) {
		System.out.println("The difference between two values is "+(a-b));
	}
	void sub(int a, double b) {
		System.out.println("The difference between two different data type values is "+(a-b));
	}
	void sub(float a, float b) {
		System.out.println("The difference between two float values is "+(a-b));
	}
	void div(int a, int b) {
		System.out.println("The result is "+(a/b));
	}
	void mul(int a, int b, int c) {
		System.out.println("The total is "+(a*b));
	}
    void mod(int a, int b) {
    	System.out.println("The remainder for the division is "+ (a%b));
    }
	void spell(String a, String b) {
		System.out.println("The collection of two words reads "+ (a +" " +b));
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodOverload result = new MethodOverload();
		
		result.sum(24, 20, 90);
		result.sub(36, 29.4);
		result.mul(45, 67, 77);
		result.div(55, 5);
		result.mod(55, 43);
		result.spell("Fahim", "Paikar");
		
	
		
	}

}
