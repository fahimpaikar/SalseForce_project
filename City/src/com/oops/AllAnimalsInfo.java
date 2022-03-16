package com.oops;

public class AllAnimalsInfo {

	public static void main(String[] args) {
		
		Animal fishes = new Fish();
		Animal birds = new Bird();
		Animal eagles = new Eagle();
		
		fishes.animalInfo();
		fishes.eat();
		fishes.move();
		fishes.sleep();
		System.out.println("===================================\n");
	    birds.animalInfo();
	    birds.eat();
	    birds.move();
	    birds.sleep();
	    System.out.println("===================================\n");
	    eagles.animalInfo();
	    eagles.eat();
	    eagles.move();
	    eagles.sleep();

	}

}
