package Abstraction;

public abstract class BankInfo {

	int payment ;
	int accountNumber ;
	double amount ;
	String name = "John";
	int age = 30;
	String address;
	
	abstract double balance();

	abstract void deposit ();
	
	abstract void withdraw();
	
	public void printName () {
		System.out.println("The name in the account is "+name);
	}
	
}
