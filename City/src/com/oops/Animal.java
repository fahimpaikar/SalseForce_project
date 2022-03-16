package com.oops;

// This is an abstract class and abstract class always is created by having the abstract key word in front the class word.
public abstract class Animal {

	// these are abstract methods, abstract methods are created by having abstract key word infront of the method name and with no method body.
	// coz they will be used in other classes.
	public abstract void move();
	public abstract void eat();
	public abstract void sleep();
	
	// concrete method 
	public void animalInfo() {
		System.out.println("All animals have ability to move!");
	}
	
	
	
}
