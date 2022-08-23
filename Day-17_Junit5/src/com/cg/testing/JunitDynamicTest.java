package com.cg.testing;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class JunitDynamicTest
{
	@TestFactory
	Collection<DynamicTest>print()
	{
		return Arrays.asList(dynamicTest("Simple dynamic Test",()->assertTrue(true)),
				dynamicTest("My Executable class",new MyExecutable())
		);
	}

}
class MyExecutable implements Executable
{
	public void execute()
	{
		System.out.println("Welcome to M23 Batch");
	}
}