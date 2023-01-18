package CodingChallenges.WordCountMap;

import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * return a Map object where the key is a word and the value is the number of occurrences of the word.
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){

        String[] wordArr = words.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word: wordArr){
            if(!map.containsKey(word)){ //check to see if the key doesn't exist
                map.put(word, 1);
            }else {//else adds 1 to the the key's value
                int newValue = map.get(word);
                map.put(word, ++newValue);
            }
        }

        return map;

    }
}
