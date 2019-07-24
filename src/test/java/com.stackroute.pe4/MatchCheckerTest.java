package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class MatchCheckerTest {
    private MatchingPattern matchingPattern;


    /*
    This method runs before each test cases and assigns required values to variables.
     */

    @Before
    public void setUp() {
        matchingPattern = new MatchingPattern();
    }

    /*
    This method runs after each test cases and destroys the created variable or changes the value.
     */
    @After
    public void tearDown() {
        matchingPattern = null;
    }


    /*
    To Test setString() method.
    Should return NullPointerException if we pass null value.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullValueShouldReturnNullPointerException() {
        matchingPattern.setString(null);
    }



    /*
    To test setString() method.
    Should Return RuntimeException if we pass an empty String to it.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldReturnRunTimeException() {
        matchingPattern.setString("");
    }

    /*
    To test setString() and matchChecker() methods.
    Should Return True, if a valid string value is passed to setString() method.
    Should Return True, if the given string holds harry in that.
     */
    @Test
    public void givenStringWithHarryShouldReturnTrue() {
        assertTrue(matchingPattern.setString("I am harry"));
        assertTrue(matchingPattern.matchChecker());
    }

    /*
    To test setString() and matchChecker() methods.
    Should Return True, if a valid string value is passed to setString() method.
    Should Return False, if the given string don't have harry in it.
    */
    @Test
    public void givenStringWithOutHarryShouldReturnFalse() {
        assertTrue(matchingPattern.setString("I am hary"));
        assertFalse(matchingPattern.matchChecker());
    }

    /*
    To test setString() and matchChecker() methods.
    Should Return True, if a valid string value is passed to setString() method.
    Should Return True, if the given string holds harry even in upper case in that.
    */
    @Test
    public void givenStringWithUpperCaseHarryShouldReturnTrue() {
        assertTrue(matchingPattern.setString("I am Harry"));
        assertTrue(matchingPattern.matchChecker());
    }



}