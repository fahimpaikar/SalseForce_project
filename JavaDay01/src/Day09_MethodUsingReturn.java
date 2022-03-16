
public class Day09_MethodUsingReturn {

	public static void main(String[] args) {
		
	 int x = methodOne();
	  System.out.println(methodOne());
	  System.out.println("The total value out of this would be "+x);
	  Day09_MethodUsingReturn b = new Day09_MethodUsingReturn();
	  String returnValue = b.methodTwo();
	  System.out.println(returnValue);
     int total = methodThree(45,65,77,44);
      System.out.println(total);
     
     
      
	}
    
	public static int methodOne() {
		int a = 10;
		int b = 25;
		int sum = a + b;
		
		return sum;
	}
	 public String methodTwo() {
		 
		 String a = "hello world";
		 return null;
		 
	 }
	
	 public static int methodThree(int a,int b, int c, int d) {
		
		 int sum = a + b + c + d;
		 return sum;
		 
	 }
	 
	 
	 
	
}
