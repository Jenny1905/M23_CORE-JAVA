package com.cg.junittestcases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/*Parameterized tests make it possible to run a test multiple times with different 
arguments. They are declared just like regular @Test methods but use the 
@ParameterizedTest annotation instead.*/

public class ParameterizedTestDemo {

	@ParameterizedTest
	//Argument Source Annotations
    @ValueSource(ints = {1, 2, 3})
    void test_int_arrays(int arg) {
        assertTrue(arg > 0);
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(ints = {1, 2, 3})
    void test_int_arrays_custom_name(int arg) {
        assertTrue(arg > 0);
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @ValueSource(strings = {"apple", "banana", "orange"})
    void test_string_arrays_custom_name(String arg) {
        assertTrue(arg.length() > 1);
    }



}
