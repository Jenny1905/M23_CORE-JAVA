package com.cg.junittestcases;
//demo on Argument source annotation-@EnumSource
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
@DisplayName("Pass enum values to our test method")
class EnumSourceExample {

	
	 
	    @DisplayName("Should pass non-null enum values as method parameters")
	    @ParameterizedTest(name = "{index} => pet=''{0}''")
	    @EnumSource(Pet.class)
	    void shouldPassNonNullEnumValuesAsMethodParameter(Pet pet) {
	        assertNotNull(pet);
	    }
}
