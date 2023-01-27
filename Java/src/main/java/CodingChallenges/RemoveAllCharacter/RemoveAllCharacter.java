package CodingChallenges.RemoveAllCharacter;

import java.util.Arrays;

public class RemoveAllCharacter {

    /**
     * Return a String that has all the character of a String removed.
     * @param str
     * @param ch
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch){

        return str.replace(ch, "");
    }
}
