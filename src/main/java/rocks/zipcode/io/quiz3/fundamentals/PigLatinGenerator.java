package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        char[]  stringArray = str.toCharArray();
        int start =0;
        int firstVowel = 0;
        int end =str.length();

        for(int i =0; i< end; i++){

            char c= Character.toLowerCase(str.charAt(i));
            if(Arrays.asList(stringArray).contains(c)){
                firstVowel =i;
                break;
            }
        }
        if(start != firstVowel) {
            String startString = str.substring(firstVowel, end);
            String endString = str.substring(start, firstVowel) + "ay";
            return startString + endString;
        }
        return str;
    }
}
