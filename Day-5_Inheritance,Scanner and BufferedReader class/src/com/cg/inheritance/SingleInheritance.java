package com.cg.inheritance;
//Program on Single Inheritance
class Parent
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey Guys! What's going on?");
	}
}
class Child extends Parent
{
	void accept()
	{
		System.out.println("rollno is: "+rollno);
	}
	
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.rollno=121;
		c.accept();
		c.print();

	}

}
