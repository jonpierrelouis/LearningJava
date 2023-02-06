package CodingChallenges.MaxMinusMin;

import java.util.Arrays;

public class MaxMinusMin {

    /**
     * return the difference between the highest and lowest values of the array.
     * @param nums an int array.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(int[] nums){

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        return max - min;
    }
}
