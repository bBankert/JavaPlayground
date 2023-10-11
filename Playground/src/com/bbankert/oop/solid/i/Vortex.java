package com.bbankert.oop.solid.i;

public class Vortex implements Drivable, Sailable {

	@Override
	public void sail() {
		System.out.println("Vortex sails");
	}

	@Override
	public void drive() {
		System.out.println("Vortex drives");
	}

}
