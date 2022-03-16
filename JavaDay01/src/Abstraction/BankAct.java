package Abstraction;

public class BankAct extends BankInfo {

	
	double balance(double money) {
		System.out.println("Your current balance is: "+money);
		return amount;
	}

	
	void deposit() { 
		System.out.println("Your deposit was accepted.");
	}

	void withdraw(double money) {
		if(amount < 0) {
			System.out.println("You can not withdraw more than "+ amount);
		}  else {
			System.out.println("Thank you very much!!");
		}
		
	}


	double balance() {
		
		return amount;
	}

	void withdraw() {
		
		
	}

	
	
}
