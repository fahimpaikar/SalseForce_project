package com.oops;

public class AnZoo {

	public static void main(String[] args) {
		
		
		Loin cat = new Loin();
		Horse hrs = new Horse();
		
		cat.eat();
		cat.danger();
		cat.move();
		cat.origin();
		cat.sleep();
		System.out.println("=========================================\n");
		hrs.danger();
		hrs.eat();
		hrs.move();
		hrs.origin();
		hrs.sleep();
          System.out.println(args[2]);
	}

}
