package com.cg.threadsdemo;

/*wait() method:-
----------------
wait method is alternative for join method. When wait() is called the current thread goes to waiting state untill the other thread notify it.
The Thread which made another thread to wait will execute first then after executing it will notify the thread which is in wait state.

wait() is overloaded method in thread class
--> wait()
--> wait(long ms)
--> wait(long ms, int ns)


***NOTE: wait(), notify(), notifyall() all these method should be written inside synchronized block.*/
//example-1 interthread communication
class customer extends Thread
{
	int balance =15000;
	public void run()
	{
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println("Transcation started..!");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
			}
		}
		for (int i=1;i<=10 ;i++ )
		{
			balance = balance-1000;
			System.out.println("withdraw is completed..!");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
			}
		}
		synchronized (this)
		{
			/*notify() method:-
			-----------------
			notify method is called by the executing thread to the waiting thread to indicate that thread to come out of waiting state.
			 */
			notify();
		}
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println("Transcation closed.!");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
			}
		}
		

	}
}
class InterThreadCommunicationExample
{
	public static void main(String[] args) 
	{
		customer c = new customer();
		System.out.println("balance before the transcation is: "+c.balance);
		c.start();
		try
		{
			synchronized (c)
			{
				c.wait();
			}
		}
		catch (InterruptedException e)
		{
		}
		System.out.println("balance after the transcation is: "+c.balance);
	}
}
