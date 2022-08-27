package com.cg.enums;
//to demonstrate that Enum implements the interface
public enum Size implements PizzaSize
{
	SMALL,MEDIUM,LARGE,EXTRALARGE;

	@Override
	public void size() {
		System.out.println("Size is: "+this);
		
	}
	

}
