package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingPattern {

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
    Returns True if the part of the string matches with the pattern else returns false.
     */
    public boolean matchChecker() {
        Pattern pattern = Pattern.compile("(\\s?)(?i)harry(\\s?)");
        Matcher matcher = pattern.matcher(this.givenString);
        return matcher.find();
    }




}
