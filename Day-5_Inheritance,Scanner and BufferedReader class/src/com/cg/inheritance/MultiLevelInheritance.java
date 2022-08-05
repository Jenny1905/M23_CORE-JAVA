package com.cg.inheritance;
//program on multilevel Inheritance
//parent class 1
class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I like to drive a bike");
	}
	
}
//Parent class for pulser125 and child class of Bike
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is: "+speed);
	}
}
class Pulser125 extends Pulser
{
	void accept()
	{
		System.out.println("Color is: "+color);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.color="Black";
		p.speed=60;
		p.accept();
		p.display();
		p.print();

	}

}
