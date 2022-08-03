package com.cg.oops;
class Animal
{
	int x;
	//Non-Parameterized Constructor
	Animal()
	{
		x=15;
	}
	void display()
	{
		System.out.println("Lion"+" "+x);
	}
}
public class NonParameterizedConstructor {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();

	}

}
