package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OccurrenceOfACharacter {
    private String givenString;

    /*
    Returns True if the given input is a valid String.
    Throws Null Pointer Exception if the input is null.
     */
    public boolean setString(String givenString) {
        boolean boo = false;
        if (givenString != null) {
            this.givenString = givenString;
            boo = true;
        }
        else {
            throw new NullPointerException();
        }
        return boo;
    }

    /*
    Returns InvalidParameter Exception if the input is int to setString() method.
     */
    public boolean setString(int givenString) {
        throw new InvalidParameterException();
    }

    /*
    Returns Number of occurrence of a character in a String.
     */

     public int getNumberOfOccurrence(char givenCharacter){
        char[] charArray = this.givenString.toCharArray();
         List<Character> characterList = new ArrayList<>();
         for (Character character: charArray){
             characterList.add(character);
         }
        return Collections.frequency(characterList, givenCharacter);
     }



}
