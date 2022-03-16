package com.oops;

public class Horse implements Animals, ZooAn {

	@Override
	public void move() {
		System.out.println("Horses move by walking and running with four legs.");
		
	}

	@Override
	public void eat() {
		System.out.println("Horses eat hay and grass.");
		
	}

	@Override
	public void sleep() {
		System.out.println("Horses sleep 9 hours in a day.");
		
	}

	@Override
	public void danger() {
		System.out.println("Horses are not dangerous animals.");
		
	}

	@Override
	public void origin() {
		System.out.println("Horses are orginally form Asia.");
		
	}
	

}
