package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
/*This class will be disable when you run the code and your all the method output will
not print as its disabled*/
public class DisabledClassDemo 
{
	@Test
	void print()
	{
		System.out.println("Hey there, i am using Disable annotation");
	}

}
