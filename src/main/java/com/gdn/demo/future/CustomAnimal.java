package com.gdn.demo.future;

public class CustomAnimal extends Animal{
	
	private String eatWhat;
	private String howToMove;
	private String makeWhatSound;
	
	public CustomAnimal(String eatWhat, String howToMove, String makeWhatSound) {
		this.eatWhat = eatWhat;
		this.howToMove = howToMove;
		this.makeWhatSound = makeWhatSound;
	}
	
	public void onInitialized() {
		System.out.println("Custom animal born...");
	}
	
	public void onDestroyed() {
		System.out.println("Custom animal died...");
	}

	@Override
	public void eat() {
		System.out.println("eating: " + eatWhat);
		
	}

	@Override
	public void move() {
		System.out.println("move: " + howToMove);
		
	}

	@Override
	public void makeSound() {
		System.out.println("make sound:" + makeWhatSound);
		
	}

}
