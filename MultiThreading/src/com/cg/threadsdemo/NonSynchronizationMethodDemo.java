package com.cg.threadsdemo;
//if we not use any synchronized method then at a time multiple threads will access a resource
class Display
{
	public void player(String name)
	{
		try
		{
			for (int i=0;i<=5;i++)
			{
				System.out.println("batsman in the order is :"+ name);
				//System.out.println();
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException e)
		{

		}
	}
}
class MyThreadd extends Thread
{
	Display d;
	String name;
	public MyThreadd(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.player(name);
	}
}
class NonSynchronizationMethodDemo
{
	public static void main(String[] args) 
	{
		Display d = new Display();
		MyThreadd t1= new MyThreadd(d,"Sachin Tendulkar");
		MyThreadd t2= new MyThreadd(d,"Rahul Dravid");
		MyThreadd t3= new MyThreadd(d,"Sourav Ganguly");
		
		t1.start();
		t2.start();
		t3.start();




		
	}
}