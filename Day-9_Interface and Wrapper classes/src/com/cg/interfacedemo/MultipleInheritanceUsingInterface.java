package com.cg.interfacedemo;
//Multiple Inheritance using interfaces
interface Father
{
	void property();
}
interface Mother
{
	void love();
}
class Daughter implements Father,Mother{

	@Override
	public void love() {
		System.out.println("Mother loves their child");
		
	}

	@Override
	public void property() {
		System.out.println("Father's gives property to child");
		
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.love();
		d.property();

	}

}
