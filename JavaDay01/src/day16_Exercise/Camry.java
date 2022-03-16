package day16_Exercise;

public abstract class Camry implements Sedans {

	public void accelerate() {
		System.out.println("Max Acceleration is 2500 rpm.");

	}

	public void brake() {
		System.out.println("These cars come with ABS brake system.");

	}

	public void start() {
		System.out.println("You can have option of remote start with these cars.");

	}

	public void stop() {
		System.out.println("These cars will automatically stop when you leave the car.");

	}

}
