package com.tns.ifet.dayeight.interfaces.extendingInterfaces;

public class ExtendingInterfaceDemo implements ChildInterface {
	// Override InterfaceOne method
	public void print() { 
		System.out.println("print method");
	}

	// Override ChildInterface method
	public void show() {
		System.out.println("show Method");
	}
}