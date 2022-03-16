package com.SalesForce.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {

		Properties obj = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\credential.properties");
			obj.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.getProperty("user.dir"));// it will print the user directory 
        System.out.println(System.getProperty("user.name"));// it will print the username of the user
        System.out.println(System.getProperty("user.home"));// it will print the home directory 
        System.out.println(System.getProperty("os.name"));// this will print the operating system
        System.out.println(System.getProperty("os.name"));// version of the operating system
        

	}

}
