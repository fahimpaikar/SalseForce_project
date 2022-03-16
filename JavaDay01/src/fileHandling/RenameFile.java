package fileHandling;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		
		File oldFile = new File("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample1.txt");
		File newFile = new File ("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\new-sample1.txt");
		File latestFile = new File ("C:\\Users\\fahim\\OneDrive\\Documents\\sample1.txt");
		if (oldFile.renameTo(newFile)) {
			  System.out.println("The file was renamed.");
		}else {
			System.out.println("The file was not renamed.");
		}
		
	    newFile.renameTo(latestFile);
	    System.out.println("The file is stored in Documents.");

	}

}
