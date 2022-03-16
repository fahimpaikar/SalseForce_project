package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInPutStream {

	public static void main(String[] args) throws IOException {
	  
		File file = new File("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample2.txt");
		FileInputStream fis = new FileInputStream(file);
		Scanner filereader = new Scanner(file);
		
		int a = 0;
		while((a=fis.read())!= -1) {
			System.out.print((char)a);
		}
	    fis.close();
		

	}

}
