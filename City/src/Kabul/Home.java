package Kabul;

public class Home {

	public static void main(String[] args) {
		
		String fName = "     Sahar";
		String lName = new String ("Fayeq");
		char[] a = { 'M', 'U', 'S', 'A', 'W', 'I', 'R' };
		String d = new String (a);
		System.out.println(d.length());
       System.out.println(fName);
		System.out.println(fName.compareTo(lName));

		
		System.out.println(fName.toUpperCase());
		System.out.println(lName.toLowerCase());
		System.out.println(fName.contentEquals(lName));
		System.out.println(fName.compareTo(lName));
		System.out.println(fName.concat(lName));
		System.out.println(fName.trim());
		System.out.println(fName.startsWith(" "));
		System.out.println(fName.indexOf(6));
		
		String name = "Codegator inc";
		char returnChar = name.charAt(4);
		System.out.println("the Charactor present in index of 4 is: "+returnChar);
		
		int returnIndex = name.indexOf('o');
		System.out.println("The index of o is: "+returnIndex);
		
		int returnIndexNot = name.indexOf('z');
		System.out.println("the index of z does not exist "+ returnIndexNot);
		
		int returnStringIndex = name.indexOf("inc");
		System.out.println("the index of a string is: "+returnStringIndex);
		System.out.println(name.indexOf("go"));
		
		// using substring methods in string class
		
		System.out.println(name.substring(4));
		System.out.println(name.substring(4, 9));
		
		// using the replace method in String Class
		
		System.out.println(name.replace('C', 'j'));
		
		System.out.println(name.replace('g', 'H'));
		
		System.out.println("**********************)))))))))))))))))))((((((((((((((((************************");
		
		String Name = "y1o2u 3a4r5e6 7v8e9r0y lucky to have me!!!";
		System.out.println(Name.replaceAll("have", "had"));
		
		System.out.println("*************************");
		
		System.out.println(Name.replaceAll("[0-9]", ""));
		
		System.out.println("*************************");
		
		System.out.println(Name.replaceAll("[a-z]", ""));
		
		System.out.println("*************************");
		
		System.out.println(Name.replaceAll("[a-z A-Z]", ""));
		
		System.out.println("*************************");
		
		System.out.println(Name.replaceAll("[a-z A-Z 0-9]", ""));
		
		System.out.println("*************************");
		
		System.out.println(Name.replaceAll("[^a-z A-Z]", ""));
		
		System.out.println("*************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
