package hashMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_02 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> cars = new HashMap<Integer, String>();
		cars.put(01, "Toyota");
		cars.put(02,"Lexus");
		cars.put(03, "Jeep");
		cars.put(04, "Tesla");
		cars.put(05,"Nissan");
		cars.put(06, "Jeep");
		
		System.out.println(cars);
		
	//	cars.clear();// this method will clear the hashmap
		Object newCar = cars.clone();
		System.out.println("This is printing out from clone method "+newCar);
		cars.containsKey(3);// this method checks if a key is present in the HashMap
		System.out.println(cars.containsKey(5));
		cars.containsValue("Toyota");// this method will check if a value is present in the hashmap
		System.out.println(cars.containsValue("Tesla"));
		String carMake = cars.get(3); // this method will return the value in a specific key
		System.out.println(carMake);
		cars.isEmpty();// this method will check if the HashMap is empty or not
		if (cars.isEmpty()) {
			System.out.println("The hashmap is totaly empty.");
		} else {
			System.out.println("you have a lot of stuff in the hashmap.");
		}
		
		cars.keySet();// this method will return the keys only
		Set<Integer> allTheKeys = cars.keySet();
		System.out.println("This hashmap has these keys "+allTheKeys);
		cars.values(); // this method will return only the values in a HashMap
		Collection<String> allTheValues = cars.values();
		System.out.println(allTheValues);
		cars.remove(2);// this method will remove one specific KV pair by giving the key number
		System.out.println(cars);
		cars.remove(3, "Jeep");
		System.out.println(cars);
		cars.putAll(cars);// copy all elements of one HashMap to another HashMap
		
		
		Set<Entry<Integer, String>> car = cars.entrySet();
		
		Iterator<Entry<Integer, String>> i = car.iterator();
		while (i.hasNext()) {
		//	System.out.println(i.next());
			
			Entry<Integer,String> getKv = i.next();// if we want to get only the key or value we use following methods from iterator.
			System.out.println("The key is : "+getKv.getKey()+" And the value is: "+ getKv.getValue());
			
		}
		

	}

}
