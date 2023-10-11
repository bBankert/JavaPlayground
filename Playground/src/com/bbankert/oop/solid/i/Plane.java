package com.bbankert.oop.solid.i;

public class Plane implements Flyable, Drivable {

	@Override
	public void drive() {
		System.out.println("Plane drives");
	}

	@Override
	public void fly() {
		System.out.println("Plane flies");
	}

}
