package com.bbankert.oop.encapsulation.package1;

import com.bbankert.oop.encapsulation.package2.ClassB;

public class Demo {
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.doSomething2();	// protected modifier demo
		
		ClassB classB = new ClassB();
//		classB.doSomethingClassB(); // package private demo
	}

}
