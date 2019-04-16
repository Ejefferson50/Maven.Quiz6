package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        String result = "";
        for(int i = 0; i < chars.length; i++){
            result += String.valueOf(chars[i]);

        }
        return result;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        String result = "";
        for(Character c: chars){
            result += String.valueOf(c);
        }
        return result;
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        String update = string.replaceAll("[A,a,E,e,I,i,O,o,U,u]", "");
        return update;
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        char[] removies = charactersToRemove.toCharArray();
        for(int i = 0; i < removies.length; i++){
            String removal = String.valueOf(removies[i]);
            string = string.replaceAll(removal, "");
        }
        return string;

    }
}
