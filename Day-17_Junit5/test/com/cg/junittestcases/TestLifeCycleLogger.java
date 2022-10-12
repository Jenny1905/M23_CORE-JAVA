package com.cg.junittestcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/*On interface default methods, JUnit Jupiter allows you to specify 
 * @Test, @RepeatedTest, @ParameterizedTest, 
 * @TestFactory, @TestTemplate, @BeforeEach, and @AfterEach.If the test interface 
 * or test class is annotated with @TestInstance(Lifecycle.PER CLASS),
 *  @BeforeAll and @AfterAll can be declared on static methods in a 
 *  test interface or on interface default methods.*/
@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger {
	
		//It is used to signal that the annotated method should be executed after all 
		//tests in the current test class.
		@AfterAll
		//default method
		default void testMethod()
		{
			System.out.println("Test Method");
		}
		//It is used to signal that the annotated method should be executed 
		//before all tests in the current test class
		@BeforeAll
		default void beforeAllTests()
		{
			System.out.println("Before all test");
		}

}
