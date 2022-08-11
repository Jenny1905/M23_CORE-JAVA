package com.cg.thisdemo;

public class Executor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Derived d=new Derived();//default constructor
		@SuppressWarnings("unused")
		Derived d1=new Derived(33);//parameterized constructor
	}

}
