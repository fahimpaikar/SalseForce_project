import java.util.Scanner;

public class Day09_Task {

	public static void main(String[] args) {
	
	int loanAmount = Loan();	
		
	}
    
	public static int Loan() {
	     	Scanner Credit = new Scanner(System.in);
		       System.out.println("Please Enter Your First Name");
		    String firstName = Credit.next();
		        System.out.println("Please Enter Your Last Name");
		    String lastName = Credit.next();
		         System.out.println("Please Enter your Credit Score ");
		    int creditScore = Credit.nextInt();
		
	
		   if(creditScore>800) {
			   System.out.println("you are approved for $20000");
		   }  else if (creditScore<800 && creditScore>700) {
			   System.out.println("you are approved for $10000");
		   }  else if (creditScore<=600 && creditScore>=500) {
			   System.out.println("you are approved for $5000");
		   }  else if(creditScore<500) {
			   System.out.println("your application is denied");
		   }
	
		return creditScore;
		
	}
	
}

