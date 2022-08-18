package com.cg.list;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		obj.add(0, "Shiwani");
		obj.add(0, 'z');
		obj.add(0, 12.5f);
		System.out.println(obj);
		//to insert
		obj.push(34);
		System.out.println(obj);
		//to remove the element
		obj.pop();
		System.out.println(obj);
		
	}

}
