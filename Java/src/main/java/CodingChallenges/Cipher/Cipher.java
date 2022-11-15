package CodingChallenges.Cipher;

public class Cipher {
    /**
     * This caesar cipher shifts all letters by n steps in the alphabet,
     * e.g.
     * abc
     * becomes
     * bcd
     *
     * @param original The original, unencrypted String. You may assume that all characters are lowercase.
     * @param increment The offset that will shift all letters in the alphabet.
     * @return an encrypted version of original using the caesar cipher.
     */
    public String encrypt(String original, int increment){

        //convert original string into an array of letters
        char[] letters = original.toCharArray();
        String newString = "";
        //
        increment = increment % 26;

        if(increment < 0){
            increment = 26 - (-1*increment);
        }

        //go through each letter to change the value
        for(char letter : letters){

            int letterToInt = (int) letter;

            letterToInt += increment;

            if(letterToInt > 122){
//                letterToInt = 97 + increment;
                letterToInt = letterToInt - 122 + 97 -1;//add a minus 1 to account for the modulus starting at one
            }

            newString += Character.toString(letterToInt);

        }

        return newString;
    }
}
