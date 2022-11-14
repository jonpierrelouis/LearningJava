package CodingChallenges.Average;

import java.util.Arrays;

public class AverageExample {

    /**
     * Not really a difficult problem, but I wanted to do something using Array streams.
     * @param nums
     * @return
     */
    public double getAvg(int[] nums){

        double ans = Arrays.stream(nums).sum()*1.0;

        return ans/nums.length;
    }
}
