package Mazar;

public class bank {

	private String fName;
	private int accNumb;
	private double amount;
	
	public void  setName (String name) {
		fName = name;
	}
	public void setaccNumb (int account) {
		accNumb = account;
	}
	public void setamount(double amount) {
		this.amount = amount;
	}
	
	public String getName() {
		return fName;
		
	}
	public int getaccNumb() {
		return accNumb;
	}
	public double getamount() {
		return amount;
	}
	
	
	
	public static void main(String[] args) {
		
		bank BOA = new bank();
		BOA.setName("Fahim");
		BOA.setaccNumb(673637836);
		BOA.setamount(24590.90);
		System.out.println(BOA.getName());
	    System.out.println(BOA.accNumb);
	    System.out.println(BOA.amount);
	}

}
 