package Day_13_Inheritance;

public class Child_Class_B extends ParentClass {
    double salary = 29500;
    public void address() {
    	System.out.println("This is my address!!!");
    }
    
	public static void main(String[] args) {
		
		Child_Class_B obj = new Child_Class_B();
		
		System.out.println(obj.age);
		obj.hello();
		System.out.println(obj.salary);
		
		obj.address();
		
	}

}
