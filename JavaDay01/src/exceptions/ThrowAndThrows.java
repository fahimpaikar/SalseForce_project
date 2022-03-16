package exceptions;

import java.io.IOException;

public class ThrowAndThrows {

	public static void main(String[] args) throws IOException {
		
		School(6);
		                   // these notes are related to FINAL keyword//
        	// when you add final key word to the class, that class can not be inherited
		   // when you add final key word to the method it can't be over ridden
		  // when you add final key word to a variable it can not be reinitialized.

	}

	public static void School (int age) throws IOException {
	    int studentAge = age;
	    if(studentAge < 6) {
	    	throw new ArithmeticException ("The age you entered is below 6 years old.");// we don't have to have throws word in method declaration for unchecked exc
	    } else {
	    	System.out.println("your application was submitted.");
	    }
	         throw new IOException();// for checked exceptions we must add throws exception phrase in the method declaration.
	}
}
