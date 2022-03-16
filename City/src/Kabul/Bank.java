package Kabul;
      

                       // Chain Constructor //
public class Bank {

	String name;
	int salary;
	String address;
	int age ;
	
	public Bank () {
		
		this("Ahmad");
	}
	
	public Bank (String EmpName) {
		
		this(EmpName, 300000);
	}
	
	public Bank(String EmpName, int EmpSalary) {
		
		this(EmpName,EmpSalary, "Kabul" );
	}
        
	public Bank (String EmpName, int EmpSalary, String EmpAdd) {
		
		this(EmpName,EmpSalary,EmpAdd, 45);
	}
	
	public Bank (String EmpName, int EmpSalary, String EmpAdd, int EmpAge) {
		
		name = EmpName;
		salary = EmpSalary;
		address = EmpAdd;
		age = EmpAge;
	}
	
	public void showInfo() {
		System.out.println(name + " " + salary + " " + address + " " + age);
	}
	
	
	public static void main(String[] args) {
		
      
        Bank empInfo = new Bank();
        empInfo.showInfo();
     
	}

}
