package com.cg.thisdemo;

public abstract class Base1 
{
	//default constructor
	Base1()
	{
		this(65);
		System.out.println("Default constructor for base1: ");

	}
	//para-constructor
	Base1(int i)
	{
		System.out.println("Parameterized constructor for base1: "+i);
	}

}
