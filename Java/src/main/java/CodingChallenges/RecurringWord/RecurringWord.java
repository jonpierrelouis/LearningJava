package CodingChallenges.RecurringWord;

public class RecurringWord {

    /**
     * @param in a String.
     * @param size the size of repeating characters we will be searching for.
     * @return true if a substring of at least n characters ever repeats, false otherwise.
     */
    public boolean recurringWord(String in, int size){

        //convert the given string into a list of all possible repeated characters with a char length of the given size
        char[] inputString = in.toCharArray();
        String finalLetters = in.substring(in.length()-size, in.length());

        in = in.replace("\\s", ""); //this removes all spaces

        for(int i = 0; i < in.length() - size + 1; i++){
            String word = "";
            for(int j = i; j < i + size; j++){ //make individual character groups to test
                word += inputString[j];
            }

            //use the split method to see if there more than one of the chosen word, if so then there must be more than 2
            int splitLength = in.split(word).length;

            if(word.equals(finalLetters)){//accounts for edge case with no repeated letters at the end of the input
                splitLength++;
            }

            if(splitLength > 2){
                return true;
            }
        }

        return false;
    }
}
