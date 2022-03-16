package iterator_01;

import java.util.ArrayList;
import java.util.Iterator;

class auto {
	String make ;
	String model;
	int year;
	
	auto (String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
}



public class Iterator_03 {

	public static void main(String[] args) {
		
		auto car1 = new auto ("Toyota", "Camry", 2017);
		auto car2 = new auto("Jeep","Wrangler", 2018);
		
		ArrayList<auto> camry = new ArrayList <auto>();
		
		camry.add(car1);
		camry.add(car2);
		
		Iterator <auto> i = camry.iterator();
		
		while (i.hasNext()) {
			auto car = i.next();
			System.out.println(car.make+ " "+ car.model+ " "+car.year);
		}
		
		
		

	}

}
