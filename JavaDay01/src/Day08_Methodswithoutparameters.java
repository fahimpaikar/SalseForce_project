
public class Day08_Methodswithoutparameters {

	public static void main(String[] args) {
		
	sample();	
	sampleTwo();
	High();	
		System.out.println(sampleTwo());
        System.out.println(High());
        
        
        
        
	}
       
	public static void sample() {
		System.out.println("This line is coming from sample method");
	}
	// When you have void it will not return a value
	
	
	// this is not a void method, it will return a value
	public static int sampleTwo() {
		int a = 20;
		return a;
	}
	 public static double High() {
		double hight = 5.11;
		return hight;
	 }
	
	
	
}
