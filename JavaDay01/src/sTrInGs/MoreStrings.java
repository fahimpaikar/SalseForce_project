package sTrInGs;

public class MoreStrings {

	public static void main(String[] args) {
		
		String name = "Hello World! today. we are learning. more java String methods";
		String[] splitmet = name.split(" ");
		System.out.println(splitmet.length);
		for(int i =0; i< splitmet.length; i++) {
			System.out.print(splitmet[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		 char [] charsString= name.toCharArray();
//		 System.out.println(charsString[4]);
//		 
//		 for(int i = 0; i< name.length(); i++) {
//			 System.out.println(charsString[i]);
//		 }

	}

}
