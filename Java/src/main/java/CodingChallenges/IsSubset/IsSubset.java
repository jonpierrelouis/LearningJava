package CodingChallenges.IsSubset;

import java.util.Arrays;
import java.util.List;

public class IsSubset {

    /**
     * Check if one array is a subset of another array, disregarding order - for instance, the array {1, 2, 3, 4, 5}
     * may have the subsets {2,3,4} or {5,2}, but the subset {1, 3, 8}. For simplicity, let's assume that all values
     * are unique.
     * @param arr an array of numbers
     * @param subset a possible subset of arr.
     * @return true if subset is a subset of arr, false otherwise.
     */
    public boolean checkSubset(int[] arr, int[] subset){

        for(Integer i : subset){
            //look for any match in the array given i
            if(Arrays.stream(arr).anyMatch(j -> i == j)){
                return false;
            }
        }

        return true;
    }
}
