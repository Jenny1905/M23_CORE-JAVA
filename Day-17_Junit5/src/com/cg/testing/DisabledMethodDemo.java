package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledMethodDemo
{
	@Test
	void display()
	{
		System.out.println("Not disable");
	}
	@Disabled
	@Test
	void accept()
	{
		System.out.println("disable");

	}

}
