package CodingChallenges.Anagram;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    /**
     * an anagram is a word that is the reordering of another word's letters.
     * Letter counts must be exact.
     *
     * @param s1 a word.
     * @param s2 another word, possibly an anagram of s1.
     * @return True if s2 is an anagram of s1, false otherwise.
     */
    public boolean check(String s1, String s2){

        List<Character> s1List = s1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> s2List = s2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        //first check size of words
        if(s1List.size() != s2List.size()){
            return false;
        }

        //check to see if all the letters of the first word are contained in the second word
        Collections.sort(s1List);
        Collections.sort(s2List);

        if(s1List.equals(s2List)){
            return true;
        }

        return false;
    }
}
