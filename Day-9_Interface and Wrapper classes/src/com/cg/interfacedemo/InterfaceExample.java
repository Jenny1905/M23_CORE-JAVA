package com.cg.interfacedemo;
//Interface Example
interface A
{
	//abstract method by default
	abstract void print();
	void display();
}
class B implements A
{

	@Override
	public void print() {
		System.out.println("Technoserve India Foundation");
		
	}

	@Override
	public void display() {
		System.out.println("Java Full Stack");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		B b=new B();
		b.print();
		b.display();

	}

}
