package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

       //String[] array = new String[] {str};
        String[] array =str.split("");
        //System.out.println(Arrays.asList(array));
        String[] output = new String[str.length()];
        for (int i = 0; i< array.length; i++){
            output[i] =array[i];
            if(i == indexToCapitalize){

                output[i] = array[i].toUpperCase();
            }

        }

        return String.join("", output);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {


        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        LinkedHashSet<String> substring = new LinkedHashSet<>();
        for(int i = 0; i<string.length(); i++){
            for(int j = i+1; j <=string.length(); j++){
                substring.add(string.substring(i, j));
            }
        }

        return substring.toArray(new String[1]);
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
