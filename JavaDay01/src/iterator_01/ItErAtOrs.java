package iterator_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ItErAtOrs {

	public static void main(String[] args) {
		
		 ArrayList<String> studentName = new ArrayList<String>();
	       
	       studentName.add("Ahmad");
	       studentName.add("Mahmood");
	       studentName.add("Hameed");
	       studentName.add("Monir");
	       
	       Iterator<String> i = studentName.iterator();
	       
	       while(i.hasNext()) {
	    	   System.out.println(i.next());
	       }
		

	}

}
