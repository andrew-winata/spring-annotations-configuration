package com.gdn.demo.future;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("app-configuration.xml");
			Cat cat = (Cat) context.getBean("cat");
			Dog dog = (Dog) context.getBean("dog");
			Bird bird = (Bird) context.getBean("bird");
			CustomAnimal customAnimal = (CustomAnimal) context.getBean("customAnimal");
			
			System.out.println("Here are your animals created by spring:");
			System.out.println("========================================");
			cat.eat();
			cat.move();
			cat.makeSound();
			
			dog.eat();
			dog.move();
			dog.makeSound();
			
			bird.eat();
			bird.move();
			bird.makeSound();
			
			customAnimal.eat();
			customAnimal.move();
			customAnimal.makeSound();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
