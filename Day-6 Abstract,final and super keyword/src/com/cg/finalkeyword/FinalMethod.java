package com.cg.finalkeyword;
class A
{
	A()
	{
		System.out.println("Constructor");
	}
	//if you make any method as final you can't override it
	//final public void accept()
	public void accept()
	{
		System.out.println("Parent class");
	}
}
class B extends A
{
	public void accept()
	{
		System.out.println("Parent class");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		B b=new B();
		b.accept();

	}

}
