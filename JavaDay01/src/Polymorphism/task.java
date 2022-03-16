package Polymorphism;

class University {
	
	int students = 256750;
	String dean = "MR. Micheal";
	
	void departments () {
		System.out.println("This University has Three branches all over the country!");
	}
    void services () {
    	System.out.println(" We provide different services for our community");	
    }
    void locations () {
    	System.out.println("This University has branches in three states!");
    }
    
    
    
}


class BranchB extends University{
	
	int students = 2500;
	void departments (){
		System.out.println("This branch has only 10 departments.");
	}
	void services() {
		System.out.println("This branch does not have any other services other than teaching!!!");
	}

}

class BranchA extends University{
	
	int students = 4500;
	void departments() {
		System.out.println(" This branch has over 21 departments.");
	}
	void locations() {
		System.out.println(" This branch is located in VIRGINIA!!");
	}

}
	public class task {
	
     public static void main(String[] args) {
		
		
		BranchA uni = new BranchA();
		BranchB univ = new BranchB();
		
		uni.departments();
		univ.departments();
		System.out.println(uni.dean);
		System.out.println(univ.students);
		uni.services();
		univ.locations();
		

	}

}




