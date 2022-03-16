
public class Day03Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c= 15;
		
		if(c> 15) {
			System.out.println("The value of c is greater than 15");
		} else if (c<15) {
			System.out.println("The value of c is lesser than 15");
		} else if(c== 15) {
			System.out.println("The value of c equals to 15");
		} else 
            System.out.println("Wrong Number");
		// Initialize a variable 'age'
		/*
		 * if the age is less than 18, we will print you are too young to work
		 * else we will print, you are over 18 and you can start working.
		 * if you are under 64, you are not retired and continue to work
		 * if you are over 64, print enjoy your retirement
		 */
		int age = 18;
		if (age<18) {
			System.out.println("you are below 18 you can not work");
		}else 
			System.out.println("youre over 18 and below 64 you should start working");
		if (age<64) {
			System.out.println("you're over 18 and below 64 you should start working");
		}else {
			System.out.println("you're about to pass away");
		}
		
		if ((age<18)&&(age>64)) {
			System.out.println("you're not allowed to work");
		}else {
				System.out.println("get a job!!");
			}
		// 1-write a program to find largest of three double values using if-else if
		/* 2- program to find largest number among three numbers using nested if
		 * 
		 */
		double b= 2.5;
		double d= 3.5;
		double e= 4.5;
		
		if(b>d) {
			System.out.println("The value of d is lower than b");
		}else if (e<d) {
			System.out.println("The value of d is greater than e");
		}else if(d==3.5) {
			System.out.println("The value of d is 3.5");
		}
		
	double f =222.22;
	double g= 313.44;
	double h= 121.44;
	  if(f>g) {
		  if(f>h) {
			  System.out.println("F is the biggest value");
		  }else {
			  System.out.println("H is the greatest value");
		  }
	  } else if(g>h) {
	  }  if(g>f) {
		  System.out.println("G is the greatest value");
	  } else {
		  System.out.println("F is the greatest Value");
	  }
	  
	  // Switch Statement
	  
	  int birthmonth = 6;
	  switch(birthmonth) {
	  case 1:
		  System.out.println("Januray");
		  break;
	  case 2:
		  System.out.println("Feb");
		  break;
	  case 3:
		  System.out.println("march");
		  break;
	  case 4:
		  System.out.println("apr");
		  break;
	  case 5:
		  System.out.println("may");
		  break;
	  case 6:
		  System.out.println("jun");
		  break;
	  default:
		  System.out.println("invalid");
		  break;
		  
	  }   
	  // The Example from Edureka 5% sales Tax and 10% discount
	  // item1*2, Item2*1, Item3*3
	  
	  int item1= 200;
	  int item2 = 75;
	  int item3 = 500;
	 
	  double price;
	  price=(item1*2)+(item2)+(item3*3);
	  System.out.println((price)+(.05*price)-(.10*price));
	  if(price>1600) {
		System.out.println("you are eligible for 25% discount in your next purchase");  
	  }
	  else if (price<1650) {
		  System.out.println("you are eligible for 10% discount");
	  }
	  else {
		  System.out.println("Thanks for shopping");
	  }
	  //  ************** SWITCH************//
	  
	  int dayoftheweek=3;
	  
	  switch(dayoftheweek) {
	  case 1: System.out.println("it's Saturday");
	      break;
	  case 2: System.out.println("it's Sunday");
	      break;
	  case 3: System.out.println("It's Monday");
	      break;
	  case 4: System.out.println("It's Tuesday");
	     break;
	     default:
	    	 System.out.println("It's a holiday");
	  
	  }
	  
	  String Name="hameed";
	  switch(Name) {
	  case "Fahim": System.out.println("Invalid Name");
	   break;
	  case "hameed": System.out.println("You found him");
	    break;
	  case "Monir": System.out.println("you didn't found him");
	    default: 
	    	System.out.println("Name Not in the system");
	  }
	  
	  char alphabet= 'e';
	  switch(alphabet) {
	  case'a':System.out.println("the initial is a");
	      break;
	  case'b':System.out.println("the initial is b");
	      break;
	  case 'c': System.out.println("the initial is c");
	      break;
	  case 'd': System.out.println("the intial is d");
	      break;
	  case'e': System.out.println("the initial is e");
	      break;
	      default: System.out.println("the initial is not an alphabet");
	  }
	  
	  
	   
	  
	}   	
}
