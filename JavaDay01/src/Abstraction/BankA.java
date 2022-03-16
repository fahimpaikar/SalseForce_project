package Abstraction;

public class BankA extends Bank {

    int deposit = 100;
     
	int getBalance(int deposit) {
		
		return  balance + deposit;
	}
	
}
