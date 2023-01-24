package CodingChallenges.PerfectPangram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PerfectPangram {

    /*
        A perfect pangram is a sentence that contains all letters of the alphabet, exactly once.
        Spaces are ignored.
         */
    public boolean isPerfectPangram(String in){

        Set<Character> set = new HashSet<>();

        //remove spaces in the input string for array
        in = in.replaceAll("\\s", "");
        char[] inArr = in.toCharArray();

        //add character to set
        for(Character i : inArr){
            set.add(i);
        }

        //check that all letters are in and no letters have been removed from original
        if(set.size() == 26 && inArr.length == set.size()){
            return true;
        }

        return false;
    }
}
