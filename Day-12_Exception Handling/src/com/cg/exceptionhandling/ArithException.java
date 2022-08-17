package com.cg.exceptionhandling;
import java.util.Scanner;
public class ArithException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int res=0;
		//try block contains exception and non-exception code
		//handling the exception using catch block
		
		try
		{
			int a=15;
			System.out.println("Enter the value of b: ");
			int b=s.nextInt();
			res=a/b;
			System.out.println(res);
		}
		//Exception is a predefined class in java which you will get the Exception name
		catch(Exception e1)
		{
			System.out.println("Exception Handled " +e1);
		}
		
		s.close();
		

	}

}
