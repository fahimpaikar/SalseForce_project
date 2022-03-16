
public class Day09_Method {

	public static void main(String[] args) {
		
       methodOne();
	  Day09_Method b = new Day09_Method();
	  b.methodTwo();
	 addition(2,4);
	 sum();
		
		
	}
     // Methods without return values and with access modifiers
	// this is static method, and use of void method which is not going to return a value
	
	public static void methodOne() {
		System.out.println("This method will print method one");
	}
	
	// use of non-static method, with void keyword which is not going to return  a value
	
	public void methodTwo() {
		System.out.println("The method will print method two");
	}
	 public static void sum() {
		 int sum = 2 + 3;
		 System.out.println(sum);
	 }
	 
	 public static void addition(int value1, int value2) {
		 int sum = value1 + value2;
		 System.out.println(sum);
	 }
	
}
