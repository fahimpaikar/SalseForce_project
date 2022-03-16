package morejava;

public class Day11_Variables {

	// Global or instance variables are declared in the class and outside method
	  int y = 44;
	  String userName = "fahim Paikar";
	  
	  String myPassword;
	 // constructor 
	   public Day11_Variables(String password) {
			myPassword = password;
			System.out.println("my password is "+myPassword);
			
		}
	  
	  
	public static void main(String[] args) {
	  	 
		
		
	
		// Local Variables are accessible in the same method, can't be accessed in different method.
		
		String username, password1;
		username = "fahim";
		password1 ="pa$sahisdj";
        int size = 5;
        int length = 10;
        int c;
        c = 35;
        System.out.println("username");
        System.out.println(c);
        int d;
        d = 8;
        System.out.println(d);
        d = 12;
        System.out.println(d);
		anotherMethod();
		
		
	// belongs to Global Variable;
//		
//		Day11_Variables aa = new Day11_Variables();
//		System.out.println(aa.userName);
//		Day11_Variables bb = new Day11_Variables();
//		System.out.println(bb.userName);
//		bb.userName = "Waqas Khan";
//		System.out.println(bb.userName);

	}

	public static void anotherMethod() {
		int d = 320;
		int e = 430;
		System.out.println(d);
		System.out.println(e);
	}

}
