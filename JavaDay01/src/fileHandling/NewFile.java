package fileHandling;

import java.io.File;

public class NewFile {

	public static void main(String[] args) {
		
		String fileLocation = "C:\\Users\\fahim\\OneDrive\\Desktop\\sample.txt";
		File myFile = new File(fileLocation);
		
		if (myFile.exists()) {
			    myFile.delete();
			    System.out.println("Your file was deleted.");
		} else {
			    System.out.println("The file you are trying to delet does not exist.");
		}

	}

}
