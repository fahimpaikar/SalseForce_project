package Day_13_Inheritance;

public class Car_Child extends Car_Parent {

	public static void main(String[] args) {
		
		Car_Child CarOne = new Car_Child();
		
		CarOne.enginSize = 3.9;
		CarOne.color = " Black";
		CarOne.model = " Camero";
		CarOne.type = " Coupe";
		
		System.out.println(CarOne.model + CarOne.type + CarOne.enginSize);
		CarOne.run();
	}

}
