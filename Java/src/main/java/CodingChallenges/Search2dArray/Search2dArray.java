package CodingChallenges.Search2dArray;

public class Search2dArray {

    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target){

        for(int j = 0; j < nums.length; j++){
            for(int i = 0; i < nums[j].length; i++){
                if(nums[j][i] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
