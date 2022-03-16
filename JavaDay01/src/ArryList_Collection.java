import java.util.ArrayList;
import java.util.Collections;

public class ArryList_Collection {

	public static void main(String[] args) {

		ArrayList <Integer> studentAge = new ArrayList<Integer>();
       
       studentAge.add(43);
       studentAge.add(33);
       studentAge.add(13);
       studentAge.add(53);
       studentAge.add(143);
       
       System.out.println(studentAge);
       
       ArrayList<String> studentName = new ArrayList<String>();
       
       studentName.add("Ahmad");
       studentName.add("Mahmood");
       studentName.add("Hameed");
       studentName.add("Monir");
       
       System.out.println(studentName);
       System.out.println(studentName.indexOf("Ahmad"));
       Collections.sort(studentName);
       System.out.println(studentName);
      
       for (int i = 0; i< studentName.size(); i++) {
    	   System.out.println(studentName.get(i));
       }
        System.out.println("************************Advance for loop*****************************");
       // Using Advanced for loop
       
       for(String i : studentName) {
    	   System.out.println(i);
       }
       
       int i = 0;
       
       while ( i < studentName.size()) {
    	  System.out.println(studentName.get(i));
    	  i++;
       }
       // contains method checks if a value is present in an ArrayList
       
       System.out.println(studentName.contains("Ahmad"));
       // Remove method removes and object from the ArrayList
       studentName.remove("Monir");
       System.out.println(studentName);
       // set method replaces an old value with a new one that we choose
      studentName.add("Mahmood"); 
      studentName.set(2, "Fahim");
      System.out.println(studentName);
      studentName.add("Mohammad");
      
      // Clear method clears out the Arraylist
      
      // studentName.clear();
    
      
      
       
       
       
       
       
       
       
     
       
    
	}

}
