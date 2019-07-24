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
        if (givenString == null){
            givenString.charAt(0);
        }
        else if (givenString.trim().isEmpty()){
            givenString.charAt(2);
        }
        else {
            this.givenString = givenString;
            boo = true;
        }
        return boo;
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
