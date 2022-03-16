package encapsulation;

public class Day18 {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;
	private double deposit;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
		if(deposit < 0) {
			System.out.println("You can not deposit negative amount.");
		} else {
			System.out.println("your current balance is: "+ balance+ deposit);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
