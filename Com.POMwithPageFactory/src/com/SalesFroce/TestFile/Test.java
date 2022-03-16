package com.SalesFroce.TestFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));// prints the path to project
		System.out.println(System.getProperty("user.name"));// user name logged in PC
		System.out.println(System.getProperty("user.home"));// the path to home of computer
		System.out.println(System.getProperty("os.name"));// operating system in PC
		System.out.println(System.getProperty("os.version"));// prints the operating system version
		
		//2 types of driver for MAC its chromedriver and for windows its chromedriver.exe
		if(System.getProperty("os.name").contains("Mac")) {
			System.out.println("The operating system on this computer is MAC");
		} else if(System.getProperty("os.name").contains("Windows")) {
			System.out.println("The operating system on this computer is Windows");
		}
		Properties readCredentials = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\config\\credential.properties");
		readCredentials.load(file);
		System.out.println(readCredentials.getProperty("username"));
		System.out.println(readCredentials.getProperty("password"));
	}

}
