package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		
		try {
			File myFile = new File("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample2.txt");
			if (myFile.createNewFile()) {
				System.out.println(myFile.getName()+ " File was created");
			} else {
				System.out.println("the file already exists!!");
			}
		} catch (IOException e ) {
			System.out.println("An error occured while creating the file.");
			e.printStackTrace();
		}

	}

}
