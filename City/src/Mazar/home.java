package Mazar;

public class home {
    String color;
    String make;
    int year;
    
	// Parameterized constructor.
	public home(String carcolor, String carmake, int caryear) {
		super();
		this.color = carcolor;
		this.make = carmake;
		this.year = caryear;
	}



	public static void main(String[] args) {
		
	// Create class object
		home car = new home("Red", "Ford", 2013);
		
		System.out.println(car.color);
		System.out.println(car.make);
		System.out.println(car.year);
		
	System.out.println("+++++++++++++++++======================++++++++++++++++");	 
	
		home sedan = new home ("Blue", "Camry", 2020);
		System.out.println(sedan.color);
		System.out.println(sedan.make);
		System.out.println(sedan.year);
		
		
		
	}

}
