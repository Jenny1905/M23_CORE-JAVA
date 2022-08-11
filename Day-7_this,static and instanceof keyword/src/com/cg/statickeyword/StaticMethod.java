package com.cg.statickeyword;

public class StaticMethod 
{
	public static void display()
	{
		System.out.println("Welcome to M23 Batch");
	}
	public static String name()
	{
		return "Hello Guys!";
	}
	public static void main(String[] args) {
		//StaticMethod s=new StaticMethod();//obj creation
		display();
		System.out.println(name());

	}

}
