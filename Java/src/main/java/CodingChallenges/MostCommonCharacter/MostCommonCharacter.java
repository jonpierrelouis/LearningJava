package CodingChallenges.MostCommonCharacter;

import java.util.Arrays;

public class MostCommonCharacter {

    /**
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        //an arr containing space for every ascii value
        int[] intArr = new int[127];
        char[] charArr = str.toCharArray();

        for(Character c : charArr){
            intArr[(int) c]++;
        }

        //get integer value of char we need
        int maxValue = Arrays.stream(intArr).max().getAsInt();
        int maxValueIndex = 0;

        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] == maxValue){
                maxValueIndex = i;
                break;
            }
        }

        //convert index to char
        char charValue = (char) maxValueIndex;

        return charValue ;
    }

}
