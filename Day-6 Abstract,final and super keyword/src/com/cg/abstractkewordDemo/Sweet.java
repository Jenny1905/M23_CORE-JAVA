package com.cg.abstractkewordDemo;
//Concrete class
class Sweet extends RasMalai
{
	public Sweet()
	{
		System.out.println("I like Rasmalai");
	}
	//non-abstract method
	public String taste()
	{
		return "Sweet";
	}
	//implementation for abstract method
	
	void print()
	{
		System.out.println("Sweet is Rasmalai");
	}

}
