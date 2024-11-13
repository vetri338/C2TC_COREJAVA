package com.tns.ifet.dayeight.iinterfaces.nestedInterfaces;


public interface MyInterface 
{
	 void calculateArea();
	    interface MyInnerInterface
	    {
	       int  id = 20;
	       void print();     
	    }
}