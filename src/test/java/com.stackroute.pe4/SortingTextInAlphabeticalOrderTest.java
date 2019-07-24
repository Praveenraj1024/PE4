package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortingTextInAlphabeticalOrderTest {

    private SortingTextInAlphabeticalOrder sortingTextInAlphabeticalOrder;

    /*
    This method runs before each test cases and assigns required values to variables.
     */

    @Before
    public void setUp() {
        sortingTextInAlphabeticalOrder = new SortingTextInAlphabeticalOrder();
    }

    /*
    This method runs after each test cases and destroys the created variable or changes the value.
     */
    @After
    public void tearDown() {
        sortingTextInAlphabeticalOrder = null;
    }


    /*
    To Test setString() method.
    Should return NullPointerException if we pass null value.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        sortingTextInAlphabeticalOrder.setString(null);
    }



    /*
    To test setString() method.
    Should Return RuntimeException if we pass an empty String to it.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRunTimeException() {
        sortingTextInAlphabeticalOrder.setString("");
    }
    /*
    To Test setString() and getSortedText() method.
    Should return True if we pass a String value to setString () method.
    Should return the text in sorted form if we callgetSortedText()  method.
     */

    @Test
    public void givenStringShouldReturnTheSortedTextInAlphabeticalOrder() {
        assertTrue(sortingTextInAlphabeticalOrder.setString("This is the given String"));
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("hisT");
        expectedOutput.add("is");
        expectedOutput.add("eht");
        expectedOutput.add("eginv");
        expectedOutput.add("ginrSt");
        assertEquals(expectedOutput, sortingTextInAlphabeticalOrder.getSortedText());
    }


    /*
    To Test setString() and getSortedText() method.
    Should return True if we pass a String value to setString () method.
    Should not return the expected output(which we mentioned in this test case) if we callgetSortedText()  method.
     */
    @Test
    public void givenStringShouldNotReturnTheExpectedOutput() {
        assertTrue(sortingTextInAlphabeticalOrder.setString("This is the given String"));
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("hist");
        expectedOutput.add("is");
        expectedOutput.add("eht");
        expectedOutput.add("eginv");
        expectedOutput.add("ginrst");
        assertNotEquals(expectedOutput, sortingTextInAlphabeticalOrder.getSortedText());
    }



}