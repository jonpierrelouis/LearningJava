package CodingChallenges.IsThereSum;

import java.util.Arrays;

public class IsThereSum {

    /**
     * Check if there exist two numbers in an array add up to some other number.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(i + j == target){
                    return true;
                }
            }
        }

        return false;
    }
}
