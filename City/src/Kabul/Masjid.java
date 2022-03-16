package Kabul;

import java.util.Scanner;

public class Masjid {

	public static void main(String[] args) {
		for(int i = 0; i <3; i++) {
	    	@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	    	System.out.println("Please enter your First Name");
	    	String fName = input.next();
	    	System.out.println("Please enter your last Name");
	    	String lName = input.next();
			System.out.println("Please enter your birth month number:");
			int monthIndex = input.nextInt();
	     
		switch (monthIndex) {
		case 1:
			System.out.println(fName +" "+lName+":  You were born in Winter.");
			break;
		case 2:
			System.out.println(fName +" "+lName+": You were born in Winter.");
			break;
		case 3:
			System.out.println(fName +" "+lName+": You were born in Winter.");
		    break;
		case 4:
			System.out.println(fName +" "+lName+": You were born in Spring.");
			break;
		case 5:
			System.out.println(fName +" "+lName+": You were born in Spring.");
			break;
		case 6:
			System.out.println(fName +" "+lName+": You were born in Spring.");
			break;
		case 7:
			System.out.println(fName +" "+lName+": You were born in Summer.");
			break;
		case 8:
			System.out.println(fName +" "+lName+": You were born in Summer.");
			break;
		case 9:
			System.out.println(fName +" "+lName+": You were born in Summer.");
			break;
		case 10:
			System.out.println(fName +" "+lName+": You were born in Fall.");
			break;
		case 11:
			System.out.println(fName +" "+lName+": You were born in Fall.");
			break;
		case 12:
			System.out.println(fName +" "+lName+"You were born in Fall.");
			break;
		default:
			System.out.println(fName +" "+lName+": You can only enter 1-12 for birth month.");
			break;
		}   
		}
	   
	  }
	}  

		

