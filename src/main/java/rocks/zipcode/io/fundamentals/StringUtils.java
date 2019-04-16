package rocks.zipcode.io.fundamentals;


import rocks.zipcode.io.arrays.ArrayUtils;
import rocks.zipcode.io.collections.PowerSet;

import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
       ArrayList<String> casings = new ArrayList<>();
        String curr = "";
        // get length of string
        int len = string.length();
        // get range of length
        Integer[] range = ArrayUtils.getRange(0, len);
        int max = 1 << len;
        // get power-set of range
        string = string.toLowerCase();

        for(int i = 0; i < max; i++){
            char[] combo = string.toCharArray();
            for(int j = 0; j < len; j++){
                if(((i >> j) & 1) == 1){
                    combo[j] = Character.toUpperCase(combo[j]);

                }

            }
           casings.add(String.valueOf(combo));
            System.out.println(casings);

        }

        return casings;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        String update = string;
        for(Integer index: indices){
            Character c = string.charAt(index);
            update = replaceAtIndex(update,Character.toUpperCase(c), index);
        }
        return update;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        String prefix = stringToBeManipulated.substring(0,index);
        String post = stringToBeManipulated.substring(index, stringToBeManipulated.length());
        String update = prefix + valueToBeInserted + post;
        return update;
    }


    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        String prefix = stringToBeManipulated.substring(0,index);
        String post = stringToBeManipulated.substring(index + 1, stringToBeManipulated.length());
        String update = prefix + replacementValue + post;
        return update;
    }
}