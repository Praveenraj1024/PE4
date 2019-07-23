package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleOccurrenceMatcherTest {


    private MultipleOccurrenceMatcher multipleOccurrenceMatcher;


    /*
    This method runs before each test cases and assigns required values to variables.
     */

    @Before
    public void setUp() {
        multipleOccurrenceMatcher = new MultipleOccurrenceMatcher();
    }

    /*
    This method runs after each test cases and destroys the created variable or changes the value.
     */
    @After
    public void tearDown() {
        multipleOccurrenceMatcher = null;
    }


    /*
    To Test setString() method.
    Should return NullPointerException if we pass null value.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        multipleOccurrenceMatcher.setString(null);
    }


    /*
    To Test setString() method.
    Should return InvalidParameterException if we pass Integer value.
     */
    @Test(expected = InvalidParameterException.class)
    public void givenIntegerValueShouldReturnInvaldiParameterException() {
        multipleOccurrenceMatcher.setString(3443);
    }

    /*
    To test setString() method.
    Should Return RuntimeException if we pass an empty String to it.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRunTimeException() {
        multipleOccurrenceMatcher.setString("");
    }

    /*
    To test setString() and getMultipleOccurrence() method.
    setString() --> Should return true if a valid String value is passed to it.
    getMultipleOccurrence() --> should return the String Array(which contains the
                                index values of the pattern).
     */
    @Test
    public void givenStringAndPatternShouldReturnTheStringArray() {
        assertTrue(multipleOccurrenceMatcher.setString("How is the weather today"));
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("7-10");
        expectedOutput.add("14-17");
        assertEquals(expectedOutput, multipleOccurrenceMatcher.getMultipleOccurrence("the"));
    }

    /*
    To test setString() and getMultipleOccurrence() method.
    setString() --> Should return true if a valid String value is passed to it.
    getMultipleOccurrence() --> should return Null if the unmatched pattern is passed to it).
     */

    @Test
    public void givenStringAndPatternShouldReturnTheNullValue() {
        assertTrue(multipleOccurrenceMatcher.setString("How is the weather today"));
        assertNull(multipleOccurrenceMatcher.getMultipleOccurrence("thei"));
    }

    /*
    To test setString() and getMultipleOccurrence() method.
    setString() --> Should return true if a valid String value is passed to it.
    getMultipleOccurrence() --> should return RuntimeException if the empty
                                String is passed to it.
     */
    @Test(expected = RuntimeException.class)
    public void givenStringAndEmptyPatternShouldReturnAnRunTimeException() {
        assertTrue(multipleOccurrenceMatcher.setString("How is the weather today"));
        multipleOccurrenceMatcher.getMultipleOccurrence("");
    }

    /*
    To test setString() and getMultipleOccurrence() method.
    setString() --> Should return RuntimeException if the empty String is passed to it.
    getMultipleOccurrence() --> Should return RuntimeException if the empty String is passed to it.
     */

    @Test(expected = RuntimeException.class)
    public void givenEmptyStringAndEmptyPatternShouldReturnAnRunTimeException() {
        multipleOccurrenceMatcher.setString("");
        multipleOccurrenceMatcher.getMultipleOccurrence("");
    }


}