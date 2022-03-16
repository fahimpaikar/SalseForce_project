package Abstraction;

public class BankAcc {

	public static void main(String[] args) {
		
		BankAct action = new BankAct();
		action.deposit();
		action.balance();
		action.printName();
		action.balance(-2300.90);
		action.withdraw(-2900.99);
        
	}

}
