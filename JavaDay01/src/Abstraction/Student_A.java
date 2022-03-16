package Abstraction;

public class Student_A extends Marks {
   

	public  Student_A (int Biology, int Chemistry , int Math) {
		this.Avg = (Biology + Chemistry + Math)/3;
	  
	}
	
	void getPercentage() {
	   System.out.println("The average score of Student A in three subjects is: "+(Avg/100)*(100)+"%");
		
	}
 
}
