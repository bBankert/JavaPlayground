package com.bbankert.oop.solid.l;

import com.bbankert.oop.solid.l.shared.FlyingBird;

public class Sparrow implements FlyingBird {
	@Override
	public void fly() {
		System.out.println("Sparrow flies");
	}

	@Override
	public void eat() {
		System.out.println("Sparrow eats");
	}
}
