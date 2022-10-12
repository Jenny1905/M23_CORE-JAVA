package com.cg.junittestcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestCaseDemo {

	

	    @RepeatedTest(3)
	    void math_add_1() {
	        System.out.println("Run math_add_1()");
	        assertEquals(2, 1 + 1);
	    }

	    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
	    void math_add_2() {
	        System.out.println("Run math_add_2()");
	        assertEquals(2, 1 + 1);
	    }

	    @RepeatedTest(value = 3, name = "{displayName} - ABC - {currentRepetition}/{totalRepetitions}")
	    void math_add_3() {
	        System.out.println("Run math_add_3()");
	        assertEquals(2, 1 + 1);
	    }

	
	  
}
