package Inheretance;

public class Eagle extends Birds{

	String name = "Eagle";
	int lifeSpan = 15;
	double highestfly = 34.98;
	
	
	public static void main(String[] args) {
		
		Eagle theEagle = new Eagle();
		
		System.out.println(theEagle.name + " "+theEagle.lifeSpan );
		theEagle.flyDown();
		
	}

}
