package Polymorphism;

class Car {
	
	int year = 2002;
	
	void type () {
		System.out.println("this car type is called Sedan");
	}
	void engine() {
		System.out.println("This car comes with a 3.9L engine size!!");
	}
	
}

class toyota extends Car{
	int year = 2020;
	void type() {
		System.out.println("This car type is called Toyota Camry");	
	}
	void color() {
		System.out.println("This car comes in 8 different colors");
	}
	void engine() {
		System.out.println("This car come with a 2.5L engine Size!!!!!");
	}
}


public class MethodOverRidding {

	public static void main(String[] args) {
	
		toyota carOne = new toyota();
		carOne.color();
        carOne.type();
        System.out.println(carOne.year);
        carOne.engine();
        
	}

}
