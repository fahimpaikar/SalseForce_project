
public class Day08_Methods_withParameters {

	public static void main(String[] args) {
		sample("Waqas");
		sample("Fahim");
		addition(78,509,96476);
		substraction(89,34,57);
        division(395,43);
        multiplication(45,68,98);
	}
 
	
	
	
	// this is a method with parameters
	public static void sample(String name) {
		System.out.println("The name your entered is "+name);
	}	
	public static void addition(int a,int b, int c) {
		int sum = a + b + c;
		System.out.println("the total is "+sum);
	}
	public static void substraction(int a, int b, int c) {
		int sub = a + b + c;
		System.out.println("The remainder is "+sub);
	}
	public static void division(int a, int b) {
		int res = a/b;
		System.out.println("The result is "+ res);
	}
	public static void multiplication(int a, int b, int c) {
		int total = a*b*c;
		System.out.println("The total is "+total);
	}
	
	}

