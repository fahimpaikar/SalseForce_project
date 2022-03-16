package Mazar;

public class Account {

	private int account_Number;
	private int accoutn_balance;
	
	public void deposit (int d) {
		
		if (d <0) {
			System.out.println("You are not allowed to deposit negative amount!!!");
		}
		else {
			System.out.println(accoutn_balance = accoutn_balance + d);
		}
	}
	
}
