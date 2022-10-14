package com.cg.threadsdemo;
//Example to Create Custom Thread with user-defined name and Priority in Java

class MyThread extends Thread
{
	/*So the default thread name can be changed by using either

	At the time of thread object creation using string parameterized constructor or
	After object creation using a set statement*/
    MyThread ()
    {
        super ();
    }
    MyThread (String name)
    {
        super (name);
    }
    public void run ()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println (getName () + "i:" + i);
        }
    }
}

class ThreadNameAndPriority
{
    public static void main (String args[])
    {
        MyThread mt1 = new MyThread ();
        MyThread mt2 = new MyThread ("child2");

        System.out.println ("mt1 threads initial name and priority");
        System.out.println ("mt1 name:" + mt1.getName ());
        System.out.println ("mt1 priority:" + mt1.getPriority ());
        System.out.println ();

        System.out.println ("mt2 threads initial name and priority");
        System.out.println ("mt2 name:" + mt2.getName ());
        System.out.println ("mt2 priority:" + mt2.getPriority ());

        mt1.setName ("child1");

        mt1.setPriority (6);
        mt2.setPriority (9);

        System.out.println ("mt1 threads changed name and priority");
        System.out.println ("mt1 name:" + mt1.getName ());
        System.out.println ("mt1 priority:" + mt1.getPriority ());

        System.out.println ();

        System.out.println ("mt2 threads changed name and priority");
        System.out.println ("mt2 name:" + mt2.getName ());
        System.out.println ("mt2 priority:" + mt2.getPriority ());

        mt1.start ();
        mt2.start ();

        for (int i = 0; i < 5; i++)
        {
            System.out.println ("main i: " + i);
        }
    }
}
