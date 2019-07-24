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
        boolean boo = false;
        if (inputString == null){
            inputString.charAt(0);
        }
        else if (inputString.trim().isEmpty()){
            inputString.charAt(1);
        }
        else{
            this.givenString = inputString;
            boo = true;
        }
        return boo;
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
