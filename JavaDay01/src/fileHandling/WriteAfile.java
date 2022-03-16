package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAfile {

	public static void main(String[] args) {
		
		try {
		   FileWriter iWrite = new FileWriter ("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample1.txt");
		   iWrite.write("I am trying to learn JAVA, it looks fun!!");
		   iWrite.write(" By Fahim Paikar");;
		   iWrite.close();
		   System.out.println("Your writing was completed.");
		} catch (IOException e ) {
			System.out.println("The was not located.");
			e.printStackTrace();
		}

	}

}
