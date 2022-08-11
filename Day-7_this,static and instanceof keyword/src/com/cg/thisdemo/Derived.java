package com.cg.thisdemo;

public class Derived extends Base1
{
	//default constructor
	Derived()
	{
		System.out.println("Default constructor for Derived");
	}
	//parameterized constructor
	Derived(int i)
	{
		this();
		System.out.println("Parameterized constructor for Derived"+i);
	}

}
