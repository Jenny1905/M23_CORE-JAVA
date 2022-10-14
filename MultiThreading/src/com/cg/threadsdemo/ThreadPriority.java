package com.cg.threadsdemo;

//1 is called minimum priority
//5 is called normal priority
//10 is called maximum priority
public class ThreadPriority extends Thread
{
    public void run ()
    {
        System.out.println ("running thread name is:" + Thread.currentThread ().getName ());
        System.out.println ("running thread priority is:" + Thread.currentThread ().getPriority ());
    }
    public static void main (String args[])
    {
        ThreadPriority m1 = new ThreadPriority ();
        ThreadPriority m2 = new ThreadPriority ();
        ThreadPriority m3=new ThreadPriority ();
        m1.setPriority (Thread.MIN_PRIORITY);
        m2.setPriority (Thread.MAX_PRIORITY);
        m3.setPriority(NORM_PRIORITY);
        
        m1.start ();
        m2.start ();
        m3.start ();

    }
}
