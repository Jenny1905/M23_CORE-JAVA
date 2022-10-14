package com.cg.threadsdemo;

public class TestMyRunnable {
		public static void main (String [] args) {
		MyRunnable myrunnable = new MyRunnable();
		//Passing myrunnable object to Thread class constructor
		Thread t1 = new Thread(myrunnable);
		t1.setName("Thread1");
		//Starting Thread t1
		t1.start();
		Thread t2 = new Thread(myrunnable);
		t2.setName("Thread2");
		t2.start();
		}
		
}

