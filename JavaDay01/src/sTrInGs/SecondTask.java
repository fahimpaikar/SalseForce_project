package sTrInGs;

public class SecondTask {

	public static void main(String[] args) {
	 
		// Task one!
		task("The weather is getting nicer every day!!!");	         
	   
		// Task two!
		System.out.println(task2("asdfasADA3232$@@"));              
       
	    
		// Task three!
	    String task3 = "Today is a good day.It is Thursday. We have a JAVA Class";
        String [] t3 = task3.split("\\.");                                        
        System.out.println(t3.length);                                            
        
	}

	// task one method
	public static void task(String value) {                     //task one method
		String t1 = value.replaceAll(" ", "");
		System.out.println(t1);
	}
	
	// task two methodA
	public static  int task2(String b) {                        // task two method
		
	    b = b.replaceAll("[^A-Z a-z]", "");
		return b.length();
	}
	  
}
 