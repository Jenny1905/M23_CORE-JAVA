package com.cg.threadsdemo;

//Example for Synchronized method
class Displayy
{
	//when we se synchronized method then at a time only one thread will access a shared resources
	public synchronized void player(String name)
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
class MyThreaddd extends Thread
{
	Displayy d;
	String name;
	public MyThreaddd(Displayy d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.player(name);
	}
}
class Demo4
{
	public static void main(String[] args) 
	{
		Displayy d = new Displayy();
		MyThreaddd t1= new MyThreaddd(d,"Sachin Tendulkar");
		MyThreaddd t2= new MyThreaddd(d,"Rahul Dravid");
		MyThreaddd t3= new MyThreaddd(d,"Sourav Ganguly");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
