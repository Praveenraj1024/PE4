package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTextInAlphabeticalOrder {
    private String paraOfText;

    /*
    Returns Null pointer Exception if the passed value is null.
    Returns False if the passed value is empty.
    Returns True if passed value is a valid String.
     */
    public boolean setString(String inputString){
        boolean boo = true;
        if (inputString == null){
            throw new NullPointerException();
        }
        else if (inputString.isEmpty()){
            boo = false;
        }
        else{
            this.paraOfText = inputString;
        }
        return boo;
    }

    /*
    Should throw an InvalidParameterException if the integer value is passed to setString().
     */
    public boolean setString(int inputString){
        throw new InvalidParameterException();
    }

    /*
    Should Return the list of sorted words in alphabetical order.
     */
    public List<String> getSortedText() {
        String[] wordsArray = this.paraOfText.split(" |,");
        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < wordsArray.length; i++){
            String[] charsInString = wordsArray[i].split("");
            Arrays.sort(charsInString, String.CASE_INSENSITIVE_ORDER);
            String string = String.join("", charsInString);
            wordsList.add(string);
        }

        return wordsList;
    }

}
