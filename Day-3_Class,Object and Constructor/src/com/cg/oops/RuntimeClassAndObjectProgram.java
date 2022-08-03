package com.cg.oops;

import java.util.Scanner;

class Vehicle
{
	//variable
	public int a;
	//user-define method
	void display()
	{
		System.out.println("Welcome to M23 Batch");
	}
}
public class RuntimeClassAndObjectProgram {

	public static void main(String[] args) {
		
		Vehicle obj=new Vehicle();
		Vehicle obj1=new Vehicle();

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		//int a=s1.nextInt();
		obj.a=s1.nextInt();
		obj1.a=s1.nextInt();
		//accessing the car class method
		obj.display();
		
		//accessing the car class variable
		System.out.println(obj.a);
		System.out.println(obj1.a);
		s1.close();


	}

}
