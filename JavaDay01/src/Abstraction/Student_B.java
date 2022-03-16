package Abstraction;

public class Student_B extends Marks {
   
     public Student_B (int Biology, int Chemistry, int Math, int Science ) {
    	this.Avg = (Biology + Chemistry + Math + Science)/4; 
    		
		
	}
	 
	void  getPercentage() {
	    
		System.out.println("The average score of Student B in four subjects is: "+ (Avg/100)*(100)+"%");
		
	}

	public static void main(String[] args) {
		Student_B b = new Student_B(80, 80, 86, 86);
		Student_A a = new Student_A(90, 80, 85);
	    a.getPercentage();
	    b.getPercentage();
	}
	

}
