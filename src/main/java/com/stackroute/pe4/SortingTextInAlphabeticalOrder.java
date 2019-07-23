package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTextInAlphabeticalOrder {
    private String paraOfText;

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

    public boolean setString(int inputString){
        throw new InvalidParameterException();
    }

    public List<String> getSortedText() {
        String[] wordsArray = this.paraOfText.split(" |,");
        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < wordsArray.length; i++){
            String[] charsInString = wordsArray[i].split("");
            Arrays.sort(charsInString, String.CASE_INSENSITIVE_ORDER);
            String string = String.join("", charsInString);
            wordsList.add(string);
//            System.out.println(string);
        }

        return wordsList;
    }

}
