package com.gdn.demo.future;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("Cat is eating... FISH");
	}

	@Override
	public void move() {
		System.out.println("Cat is moving with its four legs");
		
	}

	@Override
	public void makeSound() {
		meow();
		
	}
	
	private void meow() {
		System.out.println("meeeeooww...");
	}

}
