package com.oops;

public class Loin implements Animals, ZooAn {

	@Override
	public void move() {
		System.out.println("Loins can run very fast.");

	}

	@Override
	public void eat() {
		System.out.println("Loins eat meat by hunting other animals.");

	}

	@Override
	public void sleep() {
		System.out.println("Loins sleep 18 hours in a day.");

	}

	@Override
	public void danger() {
		System.out.println("Loins are very dangerous animals.");
		
	}

	@Override
	public void origin() {
		System.out.println("Loins are originally form African and American continents.");
		
	}

}
