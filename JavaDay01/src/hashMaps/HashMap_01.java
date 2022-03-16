package hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_01 {

	public static void main(String[] args) {

		HashMap<Integer, String> fruits = new HashMap<Integer,String>();

		fruits.put(10, "Banana");
		fruits.put(20, "Strawberry"); // does not support duplicate values 
		fruits.put(30, "Cherry");     // prints out the latest value to a key
		fruits.put(10, "Banana");
		fruits.put(25, "Orange");
		fruits.put(10, "Potatoes");

		System.out.println(fruits);


		// we can not use iterator with the HashMap if we want to use iterator we need to change the HashMap to HashSet

		Set<Entry<Integer, String>> basket = fruits.entrySet();
		// now we can use iterator with the HashSet
		Iterator<Entry<Integer, String>> i = basket.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		HashMap<Integer, String> moreFruits = new HashMap<Integer, String>();
		moreFruits.putAll(fruits);
		System.out.println(moreFruits);
		System.out.println(moreFruits.size());

		HashMap<String, String> names = new HashMap<String, String>();
		names.put("First_name", "Fahim");
		names.put("Last_name", "Paikar");
		System.out.println(names);


	}

}
