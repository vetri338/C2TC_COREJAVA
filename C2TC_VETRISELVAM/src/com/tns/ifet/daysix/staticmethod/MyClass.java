package com.tns.ifet.daysix.staticmethod;
public class MyClass {
	private int section ; 
	private static int srNo; 
	static
	{
		System.out.println("-----------Within Static Block---------");
		srNo=1000;
	}
	MyClass()
	{
		System.out.println("--------------Within Default Constructor-----------");
		srNo++;
		section++;		
	}
	
	@Override
	public String toString() {
		return "MyClass [Serial No "+srNo+", Section=" + section + "]";
	}

	//static method
	static void display() 
	{
		System.out.println("Serial No. "+srNo); 
	}
}