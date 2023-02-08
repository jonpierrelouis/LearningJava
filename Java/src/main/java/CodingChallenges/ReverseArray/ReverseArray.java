package CodingChallenges.ReverseArray;

public class ReverseArray {

    /**
     * @param nums a list of ints.
     * @return a list of ints that is in the reversed order of nums.
     */
    public int[] reverse(int[] nums){

        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[nums.length - 1 - i];
        }

        return newArr;
    }
}
