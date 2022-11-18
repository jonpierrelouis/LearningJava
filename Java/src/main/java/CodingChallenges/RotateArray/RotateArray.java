package CodingChallenges.RotateArray;

public class RotateArray {

    /**
     * Rotating an array means that all the values are shifted a certain number of spaces to the right. For simplicity,
     * we only need to test rightwards rotation.
     * For instance, the array {0,1,2,3,4,5} rotated by 2 results in {4,5,0,1,2,3}.
     * @param nums an array of ints.
     * @param inc the amount by which the array will be rotated.
     * @return nums rotated by inc.
     */
    public int[] rotate(int[] nums, int inc){

        int[] rotatedArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            rotatedArr[(i+inc) % nums.length] = nums[i];

        }

        return rotatedArr;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        RotateArray r = new RotateArray();
        int[] ans = r.rotate(test, 1);

        for(int i : ans){
            System.out.print(i +" ");
        }
    }

}
