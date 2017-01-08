package com.gdn.demo.future;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating... MEAT");
	}

	@Override
	public void move() {
		System.out.println("Dog is moving with its four legs");
	}

	@Override
	public void makeSound() {
		bark();
	}

	private void bark() {
		System.out.println("WOOF!WOOF!");
	}

}
