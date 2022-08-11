package com.cg.statickeyword;

public class StaticBlock {
	static int a;
	static String name;
	static int b;
	static String name1;
	/*StaticBlock(int a,String name)
	{
		this.a=a;
		this.name=name;
	}*/
	//static block
	static
	{
		a=34;
		name="Java";
	}
	static
	{
		b=342;
		name1="Python";
	}
	public static void main(String[] args) {
		/*StaticBlock s=new StaticBlock(a,name);
		s.a=34;
		s.name="Shiwani";*/
		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
		System.out.println(name1);

	}

}
