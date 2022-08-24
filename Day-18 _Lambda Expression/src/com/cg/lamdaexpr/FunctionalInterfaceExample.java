package com.cg.lamdaexpr;
@FunctionalInterface
interface E
{
	int add(int a,int b);//abstract method
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		/*Lambda expression with return statement
		 * E obj=(int a,int b)->
		{
			return a+b;
		};
		System.out.println(obj.add(12,15));*/
		//Lambda expression without return statement
		E obj=(int a,int b)->(a+b);
		System.out.println("Addition of a and b is: "+obj.add(12, 15));
	}

}
