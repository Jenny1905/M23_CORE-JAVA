package com.cg.exceptionhandling;

class CustomException extends Exception
{
	private int detail;
	//parameterized constructor
	public CustomException(int detail) {
		super();
		this.detail = detail;
	}
	
	public CustomException(String message) {
		super(message);
		
	}

	@Override
	public String toString() {
		return "CustomException [detail=" + detail + "]";
	}

	
}
public class UserException 
{
	static void accept(int a)throws CustomException
	{
		System.out.println("called compute");
		if(a>10)
			throw new CustomException(a);
		System.out.println("No exception");
	}

	public static void main(String[] args)
	{
		try
		{
		accept(11);
		}
		catch(CustomException e)
		{
			System.out.println("Shiwani "+e);
		}
		

	}

}
