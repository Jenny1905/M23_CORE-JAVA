package com.cg.oops;
//demo on how to use the class and object
class Car
{
	//variable
	int a=15;
	//user-define method
	void display()
	{
		System.out.println("Welcome to M23 Batch");
	}
}


public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		//object Creation
		Car obj=new Car();
		//accessing the car class method
		obj.display();
		//obj.a=55;
		//accessing the car class variable
		System.out.println(obj.a);

	}

}
