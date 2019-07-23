package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CharacterReplaceTest {

    private CharacterReplace characterReplace;

    /*
    This method runs before each test cases and assigns required values to variables.
     */

    @Before
    public void setUp() {
        characterReplace = new CharacterReplace();
    }

    /*
    This method runs after each test cases and destroys the created variable or changes the value.
     */
    @After
    public void tearDown() {
        characterReplace = null;
    }

    /*
    To test setString() method.
    should return NullPointerException if we pass null value to it.
     */


    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        characterReplace.setString(null);
    }


    /*
    To test the setString() method.
    Should Return InvalidParameterException if we pass Integer value.
     */

    @Test(expected = InvalidParameterException.class)
    public void givenIntegerShouldReturnInvalidParameterException() {
        characterReplace.setString(24);
    }


    /*
    To test setString() method.
    Should return True if we pass a valid String to it.
     */
    @Test
    public void givenStringShouldReturnTrue() {
        assertTrue(characterReplace.setString("This is the another String"));
        assertTrue(characterReplace.setString(" d  "));
    }

    /*
    To test setString() method.
    Should Return False if we pass an empty String to it.
     */
    @Test
    public void givenStringShouldReturnFalse() {
        assertFalse(characterReplace.setString(""));
    }

    /*
    To test setString() and charactersReplacer() methods.
    1. Should return True if we pass a valid String to setString() method.
    2. Should return the expected output if we pass a valid key value pair map to it.
     */
    @Test
    public void givenStringAndCharctersShouldReturnAnExpectedOutput() {
        assertTrue(characterReplace.setString("This is one another String"));
        String expectedOutput = "Thas as oie aiother Straig";
        Map<Character, Character> replaceCharacterMap = new HashMap<>();
        replaceCharacterMap.put('i', 'a');
        replaceCharacterMap.put('n', 'i');
        assertEquals(expectedOutput, characterReplace.charactersReplacer(replaceCharacterMap));
    }


    /*
    To test setString() and charactersReplacer() methods.
    1. Should return True if we pass a valid String to setString() method.
    2. Should return the expected output if we pass a valid key value pair map to it.
     */
    @Test
    public void givenStringAndCharctersShouldReturnTheExpectedOutput() {
        assertTrue(characterReplace.setString("This is one another String"));
        String expectedOutput = "Thisaisa neaan theraString";
        Map<Character, Character> replaceCharacterMap = new HashMap<>();
        replaceCharacterMap.put(' ', 'a');
        replaceCharacterMap.put('o', ' ');
        assertEquals(expectedOutput, characterReplace.charactersReplacer(replaceCharacterMap));
    }




}