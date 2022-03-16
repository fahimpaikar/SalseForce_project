package sTrInGs;

public class Day_19StringClass {

	public static void main(String[] args) {
		
		String a = "Hello world";
		String b = new String("Hello world");
		char[] c = { 'h', 'e', 'l', 'l', 'o'};
		String d = new String(c);
		System.out.println(d);
		System.out.println(d.length());
	    
		System.out.println(a);
		System.out.println(b);
		
		// converts a string class object to upper case
        System.out.println(d.toUpperCase());
       
        // converts a string class object to lower case
        System.out.println(d.toLowerCase());
        
        String x = "hello world";
        String y = "hello universe";
        // compares two strings base on their length 
        boolean returnValue2= y.equalsIgnoreCase(x);
         System.out.println("this is using equalsIgnoreCase "+returnValue2);
         boolean returnValue = y.equals(x);
         System.out.println("this is using equals method "+returnValue);
         
         
     // lexicographical comparing     
        int retrunCompareto = y.compareTo(x);
        System.out.println("compare to  "+ retrunCompareto);
        
      // lexicographical comparison ignoring the casing
        int thum =x.compareToIgnoreCase(y);
        System.out.println("compare to ignore case "+thum);
        
        // Concatenation;
        
        String g = "  Gul           ";
        String h = "    Buddin  ";
        
        String ghul = g+h;
        System.out.println(ghul);
        
       // trimming to omit spaces at the beginning or end of a string
        String trimmedV =ghul.trim();
        System.out.println("After using Trim "+ trimmedV);
    
        // starts with method
        
        boolean right = y.startsWith("hello");
        System.out.println(right);
        boolean wrong = y.startsWith("name");
        System.out.println(wrong);
        
        // ends with method
        
        boolean anay = y.endsWith("universe");
        System.out.println(anay);
        boolean anaay = y.endsWith("world");
        System.out.println(anaay);
        
        
        
        
	}

}
