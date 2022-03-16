package test;

import java.util.Scanner;

public class Day_06 {

	public static void main(String[] args) {
		// While Loop:
		// evaluates boolean statement scenarios ]:
		// We need to use the increment and decrement arguments in the code body:
		
	/*	int i = 0;
	          
		while(i <= 10){
			
			System.out.println("this is the while loop");
			i++;
		}
	
		*/  // DO While Loop:
		    // Do while loop condition is written after the loop and it executes the code at least once:
		    // post checking process will occur that is after execution of the statement block condition.
		
		/*
		int i = 0;
		do {
			System.out.println(i +" using do while loop");
			i++;
		} while(i<8);
		*/
	// Break Statement: 
		//used to break the loop or 
		/*
		for(int i =0; i<=10; i++) {
			if(i==5) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
		// print all odd numbers, ask the user for starting point and ending point and print hello world for all 
		// the even numbers along with their values.
		*/
		
	/*	Scanner getNumbers = new Scanner(System.in);
	
		System.out.println("Please enter your Starting value");
		int startingValue = getNumbers.nextInt();
		
		System.out.println("Please enter your ending value");
		int endingValue = getNumbers.nextInt();
		
		for( int i = startingValue; i <= endingValue; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " Hello world");
			}else {
				System.out.println( i+" The number you entered is an ODD number");
			}
		}
	*/	// Arrays in Java*******
		// a collection of similar type of data. it is fixed in size, you can't increase the size of array at run time
		// its a collection of homogeneous data elements.
		// 1- single dimensional Array
		
	/*	// Array declaration
		int[] a;
		// Array allocation(assigning  memory to the array)
		a = new int[5];
		a[0]= 100;
		a[1] = 150;
		a[2] = 200;
		a[3]= 250;
		a[4] = 300;
		  System.out.println(a[3]);
		  
		 String[] b;
		 b = new String[4];
		 b[0]= "Fahim";
		 b[1]= "Jan";
		 b[2]= "Paikar";
		  System.out.println(b[2]);
		  
		  // OR 
		  int[] c = new int[10];
		  // creating and initializing an Array at once:
		  
		  int[] d = { 10,20,30,40,50};
		    System.out.println(d[3]+d[4]);
		    
		    String[]e = {"fahim ","paikar ","is ","a ","nice ","guy ",": Thanks "};
		       System.out.println(e[4]);
		////////////*********\\\\\\\\\\
		       // arrayname.length shows the length of the mentioned array:
		System.out.println(e.length); 
		// if we want to run/ print the data in all of the array cells we use the following code:
		
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i]);
		}
		
		int[] numbers = {4,5,6,7,8};
		
	      System.out.println(numbers.length);
	      for(int i = 0;i<numbers.length;i++) {
	    	  System.out.println(numbers[i]);
	      }
	      
	      
	      //How to add all the values in an Array:
	      
	      int sum = 0;
	          System.out.println(sum);
	      for(int i = 0; i<numbers.length; i++) {
	    	  sum = sum+ numbers[i];
	    	  System.out.println("The value of sum inside the loop is " +sum);
	      }
		   
	   System.out.println("the value of sum outside the loop is "+sum);
	   
	*/  // ************////////////////**************//
	   
	   //  2 dimensional Arrays
	   
		
		int [][] t= new int[3][5];
		
		t[0][0]= 20;
		t[0][1]= 25;
		t[0][2]= 30;
		t[0][3]= 35;
		t[0][4]= 40;
		
		t[1][0]= 45;
		t[1][1]= 50;
		t[1][2]= 55;
		t[1][3]= 60;
		t[1][4]= 65;
			
		t[2][0]= 70;
		t[2][1]= 75;
		t[2][2]= 80;
		t[2][3]= 85;
		t[2][4]= 90;
		
//		System.out.println(t[2][3]);
//	   System.out.println(t[1][3]);
//	   
//	   int [][] b = {
//			   {20,25,30,35,40},
//			   {45,50,55,60,65},
//			   {70,75,80,85,90}
//	   };
//	         System.out.println(t[1][4]); 
//	         System.out.println(t[2][1]);
//	         System.out.println(t[0][2]);
		
		int [][] b = {
				   {20,25,30,35,40},
				   {45,50,55,60,65},
				   {70,75,80,85,90}
		};
		     for (int row=0; row < b.length; row++) {
		    	 for(int col =0; col< b[row].length; col++) {
		    		 System.out.print(b[row][col] + " ");
		    	 }
		     }
		     
		     
		 
	
	      	       
		
		
		
		
		
		
		
		
		
		
		
		
		}
		

	}


