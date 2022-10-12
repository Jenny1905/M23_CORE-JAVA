package com.cg.junittestcases;

/*if a @ParameterizedTest declares a parameter of type TimeUnit and the actual type 
 * supplied by the declared source is a String, the string will be automatically 
 * converted into the corresponding TimeUnit enum constant.
 */
import static org.junit.jupiter.api.Assertions.*;

import java.time.temporal.ChronoUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ArgumentConversion {

	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	void testWithImplicitArgumentConversion(ChronoUnit chronoUnit) {
	    assertNotNull(chronoUnit.name());
	}

}
