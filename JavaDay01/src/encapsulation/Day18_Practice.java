package encapsulation;

public class Day18_Practice {

	public static void main(String[] args) {
		
		Day18 bank = new Day18();
		
		bank.setAccountNumber(563892163);
		bank.setBalance(35478.98);
		bank.setFirstName("Jamshid");
		bank.setLastName("Janan");
		bank.setDeposit(200);
		System.out.println( bank.getFirstName()+" "+bank.getLastName()+" "+bank.getBalance()+" "+bank.getAccountNumber()+ ".");

		
		
	}

}
