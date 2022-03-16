package Abstraction;

public class BankC extends Bank {

	int deposit = 150;
	int getBalance(int deposit) {
		
		return balance + deposit;
	}

	public static void main(String[] args) {
		
		Bank getBalance = new BankA();
		Bank getbalance = new BankB();
		Bank Getbalance = new BankC();
		
	   System.out.println( "Your balance in BankA is "+getBalance.getBalance(100));
	    System.out.println("Your balance in BankB is "+getbalance.getBalance(150));
	    System.out.println("Your balance in BankC is "+Getbalance.getBalance(200));
	    
	}
}
