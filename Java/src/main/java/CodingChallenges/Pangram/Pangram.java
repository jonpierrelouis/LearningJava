package CodingChallenges.Pangram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangram {

    /**
     * A pangram is a sentence that contains all letters of the alphabet, a-z, any amount of times. Spaces are ignored.
     *
     * @param in A String. All inputs will be a-z and spaces, all lowercase.
     * @return write a method that returns true if a sentence is a pangram.
     */
    public boolean isPangram(String in){

        //get a list of letters
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] letters = alphabet.toCharArray();

        //convert input string to a set
        char[] inputString = in.toCharArray();
        Set<Character> setString = new HashSet<>();

        for(char i : inputString){
            setString.add(i);
        }

        //check to see if the input string contains a letter from the alphabet
        for(char i : letters){
            if(!setString.contains(i)){
                return false;
            }
        }

        return true;
    }
}
