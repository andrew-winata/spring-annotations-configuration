package com.gdn.demo.future;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomAnimal extends Animal {

	private String eatWhat;
	private String howToMove;
	private String makeWhatSound;

	public CustomAnimal(@Value("Tahu bulat") String eatWhat,
			@Value("Terbang pake jetpack") String howToMove,
			@Value("OM TELOLET OM") String makeWhatSound) {
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
