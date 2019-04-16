package rocks.zipcode.io.arrays;

import java.util.ArrayList;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        ArrayList<Integer> range = new ArrayList<>();
        for(int i = start; i <= end; i++ ){
            range.add(i);
        }

        return range.toArray(new Integer[range.size()]);
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] result = new char[array.length];
        for(int i = 0; i < array.length; i++){result[i] = array[i];
        }
        return result;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] result = new Character[array.length];
        for(int i = 0; i < array.length; i++){result[i] = array[i];
        }
        return result;
    }
}
