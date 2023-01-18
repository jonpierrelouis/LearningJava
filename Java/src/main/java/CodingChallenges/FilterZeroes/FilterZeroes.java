package CodingChallenges.FilterZeroes;

import java.util.Arrays;

public class FilterZeroes {

    /**
     * filter all zeroes from an array.
     * For an extra learning experience, look into how to do this problem with Streams rather than a for loop.
     * @param nums an array of ints.
     * @return an array of all the ints of nums, but with all 0 values removed.
     */
    public int[] filter(int[] nums){

        int[] ans = Arrays.stream(Arrays.stream(nums).filter(i -> i > 0 || i < 0).toArray()).toArray();
        return ans;
    }
}
