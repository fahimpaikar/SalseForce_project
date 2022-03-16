package day16_Exercise;

public class Test_Drive extends Camry {

	
	public static void main(String[] args) {
		
		Camry car1 = new Test_Drive();
		car1.accelerate();
		car1.brake();
		car1.start();
		car1.stop();
		System.out.println( "The specifications of the car is: "+car1.engine+"liter engine" + " " + car1.model + " "+car1.make+" "+car1.year+".");
		System.out.println("And the price can be as low as: $"+ car1.price);

	}

}
