import java.util.Scanner;

public class Scanner_clause {

	public static void main(String[] args) {
		// Scanner Class

		// ClassName objectName = new className(system.in);

		Scanner getInput = new Scanner(System.in);
		// created an object of scanner class.

		System.out.println("What's your good name?");

		String name = getInput.next();

		System.out.println("The name you entered is : " + name);

		System.out.println("Enter your roll number.");
		int rollNumber = getInput.nextInt();

		System.out.println("The roll number you entered is: " + rollNumber);

		System.out.println("your name is" + name + "your toll number is" + rollNumber);

		// Task 1: ask a user to enter their country and capture it. once value is
		// captured print language user speaks.
		/*
		 */

		Scanner countryName = new Scanner(System.in);
		System.out.println("What's your country name?");
		String country = countryName.next();

		switch (country) {
		case "USA":
			System.out.println("English");
			break;
		case "Pakistan":
			System.out.println("Urdu");
			break;
		default:
			System.out.println("country not found");
		}
     
		System.out.println("What's your budget to buy a car?");
		double carPrice = getInput.nextDouble();

		System.out.println("Your budget to buy a car is " + carPrice);
		System.out.println("What would be the interest rate you want to pay?");
		double intRate = getInput.nextDouble();

		System.out.println("your desired interest is " + intRate);
		System.out.println("How long would you like to lease it for?");
		int leaseTerm = getInput.nextInt();

		System.out.println("Your desired lease term is " + leaseTerm);

		int carprice = 25000;
		double intrate = 0.3;
		int leaseterm = 72;

		double payment = 0;
		payment = (carprice * intrate) / leaseterm + (carprice/60);
		System.out.println("your monthly payment is " + payment);

		System.out.println("Please put in your lucky number.");
		int luckyNumber = getInput.nextInt();
		
		if (luckyNumber%2 == 0) {
			System.out.println("Your Lucky number is Even ");
		} else {
			System.out.println("Your Lucky Number is Odd");
		}
		
		
		

	}

}
