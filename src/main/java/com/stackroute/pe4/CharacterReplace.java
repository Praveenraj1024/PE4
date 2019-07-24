package com.stackroute.pe4;

import java.security.InvalidParameterException;
import java.util.Map;

public class CharacterReplace {

    private String inputString;
    /*
    Returns NullPointer Exception if the passed value is null.
    Returns True if the valid input is passed else it should return false.

     */
    public boolean setString(String inputString){
        boolean boo = true;
        if (inputString == null){
            inputString.charAt(0);
        }
        else if (inputString.trim().isEmpty()){
            inputString.charAt(1);
        }
        else {
            this.inputString = inputString;
        }
        return boo;
    }


    /*
    Returns the String where the new character is replaced by the old character.
     */
    public String charactersReplacer(Map<Character, Character> replacingCharacterMap){
        for (Character keyValue: replacingCharacterMap.keySet()){
            this.inputString = this.inputString.replace(keyValue, replacingCharacterMap.get(keyValue));
        }

        return this.inputString;
    }

}
