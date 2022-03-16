
public class Dogs {

	// OBJECTS AND CLASSES
			// OOP CONCEPT = Object- Oriented programming
			// Main concepts of OOPS
			// 1- Object 2- class 3- inheritance 4- 
			// any entity that has state and behavior is known as an object.
			// object to object communication is done via method
			
			// Class is a collection of objects and statements.
			// class name, objectname = new class name();
	
	String breed;
	String size;
	String color;
	int age;
	String name;
	
	public static void main(String[] args) {
		
		Dogs dogOne = new Dogs();
		Dogs dogTwo = new Dogs();
		Dogs dogThree = new Dogs();
		
		dogOne.breed = "Neapolitan Mastiff";
		dogOne.size = "Large";
		dogOne.color = "Black";
		dogOne.age = 5;
		dogOne.name = "Jack";
		
		dogTwo.breed = "Maltese";
		dogTwo.size = "Medium";
		dogTwo.color ="Speen";
		dogTwo.age = 2;
		dogTwo.name = "Rocky";
		
		dogThree.breed = "Chow Chow";
		dogThree.size = "Small";
		dogThree.color = "Biege";
		dogThree.age = 10;
		dogThree.name = "Zara";
		
		System.out.println(dogThree.name+ " " + dogThree.color +" " + dogThree.age + " " + dogThree.size);
		System.out.println(dogTwo.age + dogTwo.color + dogTwo.name +dogTwo.size);
		System.out.println(dogOne.color + dogOne.name + dogOne.size + dogOne.age);
		
		// Method is a block of code; there are two types of method in class
		// 1- built in method and 2- user defined method( created by user/ programmer);
		
		

	}

}
