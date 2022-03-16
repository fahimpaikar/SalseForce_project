package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();
		cars.add("Subaru");
		cars.add("Toyota");
		cars.add("BMW");  
		cars.add("Tesla");
		cars.add("Lexus");
		cars.add("Jeep");
		cars.add("Chrysler");
		cars.add("Toyota");         // HashSet does not show duplicate values 
		
		System.out.println(cars.size());
		System.out.println(cars);
		System.out.println( "This is printing with clone method " +cars.clone());
		Object moreCars = cars.clone();
		System.out.println(moreCars);
		
		System.out.println(cars.contains("Toyota"));
		
		Iterator<String> eachCar = cars.iterator();
		while(eachCar.hasNext()) {
			System.out.println(eachCar.next());
		}
	//	cars.remove("Tesla"); // remove method remove only one element from the HashSet
		System.out.println(cars);
		System.out.println(cars.isEmpty());
	//	cars.remove("Lexus");
		System.out.println(cars);
		System.out.println(cars.equals(moreCars));
		System.out.println(cars.getClass());
	//	cars.clear();         // clear method removes all the elements from the HashSet
		System.out.println(cars);
		
		
		
		String [] motar = new String [cars.size()];// the size method can not give the exact number of elements because it eliminates the duplicate values
		cars.toArray(motar);
		
		for (String singleCar : motar) {
			System.out.println(singleCar);
		}
		
		System.out.println(motar.length);// This gets us the number of elements present in the array
		
		
		
		
	}

}
