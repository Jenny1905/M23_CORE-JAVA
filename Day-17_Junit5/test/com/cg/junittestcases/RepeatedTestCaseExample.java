package com.cg.junittestcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

class RepeatedTestCaseExample {

	@DisplayName ("Testcase for Multiplication")
	@RepeatedTest (5)    
	 void multiply (TestInfo testInfo) 
	 {
	        int a, b;
	        a=10;
	        b=20;
	             assertEquals(200, (a*b), "Matched. Test status - Passed");
	}
}
