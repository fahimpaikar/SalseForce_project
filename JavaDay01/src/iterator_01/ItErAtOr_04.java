package iterator_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ItErAtOr_04 {

	public static void main(String[] args) {
	
		ArrayList<String> studentNames = new ArrayList<>();
		studentNames.add("Ahmad");
		studentNames.add("Mahmood");
		studentNames.add("Hameed");
		studentNames.add("Monir");
		
		System.out.println(studentNames);
		
		Iterator<String> eachStudent = studentNames.iterator();
		
		while (eachStudent.hasNext()) {
			System.out.println(eachStudent.next());
		}
		

	}

}
