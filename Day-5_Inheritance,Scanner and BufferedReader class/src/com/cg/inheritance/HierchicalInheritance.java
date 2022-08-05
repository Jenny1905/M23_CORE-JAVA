package com.cg.inheritance;
//program on Hierarchical Inheritance
class AndroidVersion
{
	void display1()
	{
		System.out.println("Android-Version");
	}
}
class Kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println("Kitkat");

	}
}
class Pie extends AndroidVersion
{
	void print1()
	{
		System.out.println("Pie");

	}
}
public class HierchicalInheritance {

	public static void main(String[] args) {
		Kitkat k=new Kitkat();
		Pie p=new Pie();
		k.display1();
		k.print();
		p.print1();

	}

}
