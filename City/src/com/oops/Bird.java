package com.oops;

public class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("Birds move by flying!!!");

	}

	@Override
	public void eat() {
		System.out.println("Birds eat birdfood sold in grocery stores all around the world.");

	}

	@Override
	public void sleep() {
		System.out.println("Birds sleep 4 hours a day!");

	}

}
