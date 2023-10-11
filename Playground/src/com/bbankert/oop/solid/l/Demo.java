package com.bbankert.oop.solid.l;

import com.bbankert.oop.solid.l.shared.Bird;
import com.bbankert.oop.solid.l.shared.FlyingBird;


public class Demo {

	public static void main(String[] args) {
		FlyingBird[] flyingBirds = new FlyingBird[] { new Crow(), new Sparrow() };
		for (FlyingBird bird : flyingBirds) {
			bird.fly();
		}
		
		System.out.println("\n===========\n");
		
		Bird[] birds = new Bird[] { new Crow(), new Sparrow(), new Ostrich() };
		for (Bird bird : birds) {
			bird.eat();
		}

	}

}
