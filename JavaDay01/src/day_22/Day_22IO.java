package day_22;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Day_22IO {

	public static void main(String[] args) throws IOException {
		
		
		      // How write a file
		// create a file object   sample.txt will create the file in the folder we copy the path.
		File myfile = new File("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample.txt");
		
		FileWriter fwriter = new FileWriter(myfile); // FileWriter should be imported then we will be able to write our text using its object.write
		fwriter.write("Today we are learning about reading and writting in the file!!YAYAYAYAY");
		//fwriter.close(); // this method will close the file we just created until we have not closed the file it will not be created.
		System.out.println("The code was successfull, please check your file.");
		fwriter.write(" How you doing?");
		fwriter.close();
		System.out.println("The second sentence was added."); // if we want to add another sentence in the same file we should not close it after the first sentence.
         
		
		           // how to read a file
		
		File readFile = new File("C:\\Users\\fahim\\OneDrive\\Documents\\JAVA\\sample.txt");
		FileReader iRead = new FileReader(readFile);
		//System.out.println(iRead.read());
		
		int a = 0;
		while ((a = iRead.read()) != -1) {
			  System.out.print((char)a);
		}
		iRead.close();
		
		
		
		
		
	}

}
