package CodingChallenges.CombineArray;

public class CombineArraysExample {

    /**
     * Combining 2 arrays using System.
     * Not difficult, but wanted to learn something new
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] combine(int[] arr1, int[] arr2){

        int[] newArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0,newArr, 0, arr1.length);
        System.arraycopy(arr2, 0,newArr, arr1.length, arr1.length);

        return newArr;
    }
}
