package fileHandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		File myFile = new File("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample2.txt");
		if (myFile.exists()) {
			System.out.println("File Name: "+myFile.getName());
			System.out.println("File location: "+myFile.getAbsolutePath());
			System.out.println("Writable ? "+myFile.canWrite());
			System.out.println("Readable ? "+myFile.canRead());
			System.out.println("File size: "+myFile.length());
		}  else {
			System.out.println("The file does not exist.");
		} 
		System.out.println(myFile.getFreeSpace());
          
	}

}
