package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class OccurrenceOfACharacterTest {
    private OccurrenceOfACharacter occurrenceOfACharacter;

    /*
    This method runs before each test cases and assigns required values to variables.
     */

    @Before
    public void setUp() {
        occurrenceOfACharacter = new OccurrenceOfACharacter();
    }

    /*
    This method runs after each test cases and destroys the created variable or changes the value.
     */
    @After
    public void tearDown() {
        occurrenceOfACharacter = null;
    }


    /*
    To Test setString() method.
    Should return NullPointerException if we pass null value.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        occurrenceOfACharacter.setString(null);
    }


    /*
    To Test setString() method.
    Should return InvalidParameterException if we pass Integer value.
     */
    @Test(expected = InvalidParameterException.class)
    public void givenIntegerValueShouldReturnInvaldiParameterException() {
        occurrenceOfACharacter.setString(3443);
    }


    /*
    To test setString() method.
    Should Return RuntimeException if we pass an empty String to it.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRunTimeException() {
        occurrenceOfACharacter.setString("");
    }

    /*
    To Test setString() and getNumberOfOccurrence() method.
    Should return True if we pass a String value to setString () method.
    Should return the expected output if we call getNumberOfOccurrence() method.
     */


    @Test
    public void givenStringAndCharacterShouldReturnTheNumberOfOccurrenceOfThatCharacterInString() {
        assertTrue(occurrenceOfACharacter.setString("This is the given String"));
        int expectedOutput = 4;
        assertEquals(expectedOutput, occurrenceOfACharacter.getNumberOfOccurrence('i'));
    }


    /*
    To Test setString() and getNumberOfOccurrence() method.
    Should return True if we pass a String value to setString() method.
    Should Not return the expected value(it should return the correct value) if we call getNumberOfOccurrence() method.
     */
    @Test
    public void givenStringAndCharacterShouldNotReturnTheCorrectValue() {
        assertTrue(occurrenceOfACharacter.setString("This is the given String"));
        int expectedOutput = 3;
        assertNotEquals(expectedOutput, occurrenceOfACharacter.getNumberOfOccurrence('i'));
    }

}