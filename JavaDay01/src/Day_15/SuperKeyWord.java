package Day_15;

class University {
	
	int students = 4500;
	String Department = "Algebra";
	String location = "Virginia";
	
	void faculty () {
		System.out.println("This University had more than 4578 faculties!!");
	}
	
	void student () {
		System.out.println("This University has students from all over the world!!!");
	}
	
}

 class CompusA extends University{
	
	 int students = 1300;
	 String Department = "Biology";
	 String location = "Washington D.C.";
	 
	 void faculty () {
		 System.out.println("Campus A only contains 5 faculties.");
	 }
	 
	 void teacher () {
		 super.faculty();
		 faculty();
		 
	 }
	 
	 void info () {
		 System.out.println("The number of students in this university is "+super.students);
		 System.out.println("The number of students in Compus A is "+students);
		 System.out.println("The department of "+super.Department+ " is in the main compus.");
		 System.out.println("The department of "+ Department +" is in compus A.");
		 System.out.println("Main compus is located in "+super.location);
		 
	 }
 }



public class SuperKeyWord {

	public static void main(String[] args) {
		
		CompusA a = new CompusA();
		a.info();
		a.teacher();
		a.student();

	}

}
