package hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList {

	public static void main(String[] args) {
                
		HashSet<String> cars = new HashSet<String>();
		cars.add("Subaru");
		cars.add("Toyota");
		cars.add("BMW");  
		cars.add("Tesla");
		cars.add("Lexus");
		cars.add("Jeep");
		cars.add("Chrysler");
		cars.add("Toyota");   
		System.out.println(cars);
		
		ArrayList<String> cararray = new ArrayList<String>(cars);
		
		cararray.add("Subaru");
		System.out.println(cararray);
		cararray.remove(2);
		for(String i : cararray) {
			System.out.println(i);
		}

		

	}

}
