package com.bbankert.oop.solid.l;

import com.bbankert.oop.solid.l.shared.FlyingBird;

public class Crow implements FlyingBird {
	@Override
	public void fly() {
		System.out.println("Crow flies");
	}

	@Override
	public void eat() {
		System.out.println("Crow eats");
	}
}
