package CodingChallenges.ReturnDuplciates;

import java.util.HashSet;
import java.util.Set;

public class ReturnDuplicates {

    /**
     * Return an array of all duplicates in an array.
     * the duplicates may be in any order.
     * @param arr an array of integers.
     * @return an array of all the integers which are duplicates, in any order.
     */
    public int[] returnDuplicates(int[] arr){

        Set<Integer> incomingInt = new HashSet<>();

        Set<Integer> repeatInts  = new HashSet<>();

        for(int i : arr){
            if(incomingInt.contains(i)){
                repeatInts.add(i);
            }else {
                incomingInt.add(i);
            }
        }

        int[] duplicates = new int[repeatInts.size()];

        int index = 0;
        for(int i : repeatInts){
            duplicates[index] = i;
            index++;
        }

        return duplicates;
    }

    public static void main(String[] args) {
        ReturnDuplicates r = new ReturnDuplicates();
        int[] input = {0, 1, 2, 2, 3, 4, 4};
        int[] output = r.returnDuplicates(input);

        for(int i : output){
            System.out.print(i + " ");
        }
    }
}
