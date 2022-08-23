package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo
{
	@Test
	void division()
	{
		System.setProperty("Krutika", "Monika");
		//if Assumption is true then printing statement will print otherwise not
		Assumptions.assumeTrue("Monika".equals(System.getProperty("Kritika")));
		//if Assumption is false then only printing statement will print otherwise not
		//Assumptions.assumeFalse("Monika".equals(System.getProperty("Kriti")));
		System.out.println("Assumption is false");
	}

}
