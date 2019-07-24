package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrenceMatcher {

    private String givenString;

    /*
    Returns True if the given input is a valid String.
    Throws Null Pointer Exception if the input is null.
    Throws RuntimeException if the empty string is passed.
     */
    public boolean setString(String inputString) {
        boolean boo = false;
        if (inputString == null){
            inputString.charAt(0);
        }
        else if (inputString.trim().isEmpty()){
            inputString.charAt(2);
        }
        else{
            this.givenString = inputString;
            boo = true;
        }
        return boo;
    }


    /*
    Should check the multiple occurrence of a given pattern in the given
        string and should return the list of occurrences.
    Should return RuntimeException if the empty String is passed to it.
     */
    public List<String> getMultipleOccurrence(String pattern){
        if (pattern.trim().isEmpty()){
            throw new RuntimeException();
        }
        List<String> occurrenceIndex = new ArrayList<>();
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(this.givenString);
        while (matcher.find()){
            occurrenceIndex.add(
                    String.valueOf(matcher.start()).concat("-").concat(
                            String.valueOf(matcher.end())
                    )
            );
        }
        if (occurrenceIndex.size() == 0){
            occurrenceIndex = null;
        }
        return occurrenceIndex;
    }


}
