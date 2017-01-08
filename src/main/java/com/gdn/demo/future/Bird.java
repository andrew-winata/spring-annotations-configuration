package com.gdn.demo.future;

public class Bird extends Animal {

	@Override
	public void eat() {
		System.out.println("Bird is eating... WORM");
		
	}

	@Override
	public void move() {
		System.out.println("Bird is flying");
		
	}

	@Override
	public void makeSound() {
		chirp();
	}
	
	private void chirp() {
		System.out.println("chiirrrrpp");
	}

}
