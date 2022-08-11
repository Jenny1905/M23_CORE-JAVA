package com.cg.statickeyword;

public class StaticBlock {
	static int a;
	static String name;
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
	public static void main(String[] args) {
		/*StaticBlock s=new StaticBlock(a,name);
		s.a=34;
		s.name="Shiwani";*/
		System.out.println(a);
		System.out.println(name);

	}

}
