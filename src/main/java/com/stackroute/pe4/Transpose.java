package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Transpose {

    private String givenString;


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
        else if (inputString.trim().isEmpty()){
            throw new RuntimeException("You have entered an empty string");
        }
        else{
            this.givenString = inputString;
        }
        return boo;
    }

     /*
    Returns InvalidParameter Exception if the input is int to setString() method.
     */

    public boolean setString(int inputString){
        throw new InvalidParameterException();
    }

    /*
    Should return a String, where each and every word of a inputString should be reversed.
     */

    public String getTransposedString() {
        String[] wordsArray = this.givenString.split(" ");
        List<StringBuilder> stringBuilderList = new ArrayList<>();
        for (String word: wordsArray){
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            stringBuilderList.add(stringBuilder);
        }
        String finalOuput = "";
        finalOuput = finalOuput.join(" ", stringBuilderList);
        return finalOuput;
    }


}
