package selfStudyForJobMarket;

public abstract class Autos {

	int account_number;
	float account_balance;
	String account_name;
	int age;
	String account_address;
	
	void balanceInquiry (int a) {
		System.out.println("Your remaining balance is $"+ a);
	}
	
	void transferFunds(int b) {
		System.out.println("please make a payment of $"+ b);
		
	}
	
	
}


