import java.util.Scanner;

public class _day05 {

	public static void main(String[] args) {
		
		// LOOP Statements:
		// when you want to run the same script (x) amount of times:
		
		// 1- for loop
		// default variable name is (i); 
		 
	/*	for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		for(int i= 100; i>=1; i--) {
			System.out.println(i);
		}
		for(int i=20; i<=50;i+=2) {

		   System.out.println(i);
			}
		for(int i=20; i<=50;i+=1) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		*/
		
		
		for(int i=1;i<=3;i++) {
		
		
		 Scanner birthMonth = new Scanner(System.in);
		 System.out.println("what's your birth month");
		 String month = birthMonth.next(); 
		 System.out.println("your birth month is  "+month);
		
   
		 
		 switch(month) {
		 case "january":
		   System.out.println("you're born in winter");
		   break;
		 case "february":
			 System.out.println("you're born in winter");
			break;
		 case "march":
			 System.out.println("you're born in winter");
			break;
		 case "april":
			 System.out.println("you're born in Spring");
		 case "may":
			   System.out.println("you're born in Spring");
			   break;
		 case "june":
			   System.out.println("you're born in Spring");
			   break;
		 case "july":
			   System.out.println("you're born in Summer");
			   break;
		 case "august":
			   System.out.println("you're born in Summer");
			   break;
		 case "september":
			   System.out.println("you're born in Summer");
			   break;
		 case "october":
			   System.out.println("you're born in Fall");
			   break;
		 case "november":
			   System.out.println("you're born in Fall");
			   break;
		 case "december":
			   System.out.println("you're born in Fall");
			   break;
			 
		 }
		}
		 
		
		
		System.out.println(System.getProperty("os.name"));
		
		
		
		
		
		
		
		
		
		
		}
		
		
	
		

	}


