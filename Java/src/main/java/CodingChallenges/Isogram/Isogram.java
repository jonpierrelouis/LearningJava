package CodingChallenges.Isogram;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

    /**
     * An Isogram is a word where no letters are repeated.
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){

        Set<Character> set = new HashSet<>();

        char[] charArr = str.toCharArray();

        for(char i : charArr){
            if(set.contains(i)){
                return false;
            }else{
                set.add(i);
            }
        }

        return true;
    }
}
