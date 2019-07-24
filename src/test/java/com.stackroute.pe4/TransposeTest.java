package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class TransposeTest {

    private Transpose transpose;


    /*
    This method runs before each test cases and assigns required values to variables.
     */

    @Before
    public void setUp() {
        transpose = new Transpose();
    }

    /*
    This method runs after each test cases and destroys the created variable or changes the value.
     */
    @After
    public void tearDown() {
        transpose = null;
    }


    /*
    To Test setString() method.
    Should return NullPointerException if we pass null value.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        transpose.setString(null);
    }



    /*
    To test setString() method.
    Should Return RuntimeException if we pass an empty String to it.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRunTimeException() {
        transpose.setString("");
    }
    /*
    To test setString() and getTransposedString() method.
    Should Return True if we pass a valid String to setString() method.
    Should Return the correct Transposed String if we call getTransposedString().
     */
    @Test
    public void givenStringShouldReturnTheTransposedString() {
        assertTrue(transpose.setString("This is the given text"));
        String expectedOutput = "sihT si eht nevig txet";
        assertEquals(expectedOutput, transpose.getTransposedString());
    }

    /*
    To Test setString() and getTransposedString() method.
    Should Return True if we pass a valid String value to setString().
    Should not return the string, which is stored in expectedOutput variable.
     */
    @Test
    public void givenStringShouldNotReturnTheExpectedOutput() {
        assertTrue(transpose.setString("This is the given text"));
        String expectedOutput = "siht si eht nevig txet";
        assertNotEquals(expectedOutput, transpose.getTransposedString());
    }



}