package com.cg.statickeyword;

public class StaticBox 
{
	double width;
	double height;
	static int count=7;
	//Parameterized -constructor
	public StaticBox(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public StaticBox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("Cnt is: "+cnt);//1
		count=16;
		count++;
		System.out.println("Count is: "+count);//17

	}

	public static void main(String[] args) {
		//StaticBox s=new StaticBox (11,12);
		StaticBox s=new StaticBox ();

		System.out.println(s.width);

	}

}
