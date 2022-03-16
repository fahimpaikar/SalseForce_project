package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoUtOutstream {

	public static void main(String[] args) {
	
		try {
			
		File file = new File ("C:\\Users\\fahim\\OneDrive\\Desktop\\JAVA Practice\\fileOutPutStream.txt");
		FileOutputStream fos = new FileOutputStream (file);
		String text = "This text is created using file output stream class";
		byte b[]= text.getBytes();
		
		fos.write(b);
		fos.close();
		System.out.println("Congrats! Your file was created.");
		} catch (IOException e ) {
			System.out.println("The file already exists.");
		}
	}

}
