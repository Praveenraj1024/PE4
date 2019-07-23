package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Transpose {

    private String givenString;

    public boolean setString(String inputString){
        boolean boo = true;
        if (inputString == null){
            throw new NullPointerException();
        }
        else if (inputString.isEmpty()){
            boo = false;
        }
        else{
            this.givenString = inputString;
        }
        return boo;
    }

    public boolean setString(int inputString){
        throw new InvalidParameterException();
    }

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
