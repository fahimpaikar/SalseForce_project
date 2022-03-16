package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File iRead = new File ("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample2.txt");
			Scanner read = new Scanner (iRead);
			while (read.hasNextLine()) {
				String data = read.nextLine();
				System.out.println(data);
				
			}
			read.close();
		} catch (FileNotFoundException e ) {
			System.out.println("The file was not found.");
			e.printStackTrace();
		} 

	  System.out.println("This is out of try block");
	  

	}

}
