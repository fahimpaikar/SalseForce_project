package Day_13_Inheritance;

public class Child_Class_C extends ParentClass {
    
	boolean b = true;
	public void agree () {
		System.out.println("Do you agree to live in this address for ever??");
	}
	
	public static void main(String[] args) {
		
		Child_Class_C obj = new Child_Class_C();
		
		
		obj.agree();
		System.out.println(obj.b);
		System.out.println(obj.age);
		obj.hello();
		
	
		
		
		
	}

}
