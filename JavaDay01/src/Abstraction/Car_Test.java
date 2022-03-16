package Abstraction;

public class Car_Test {

	public static void main(String[] args) {
		
		Vehicle car1 = new Car();
		car1.speed();
        car1.engine();
        car1.color();
        car1.type();
        System.out.println(car1.make+" "+ car1.topSpeed+" "+ car1.year);
        
	}

}
