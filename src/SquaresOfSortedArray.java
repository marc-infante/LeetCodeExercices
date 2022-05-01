
/*
difficulty: easy

Given an integer array nums sorted in non-decreasing order, return an array of the squares of
each number sorted in non-decreasing order.
*/

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int ini=0,fin=nums.length,index=nums.length;

        while(ini<=fin){
            int sq1 = nums[ini]*nums[ini];
            int sq2 = nums[fin]*nums[fin];

            if(sq1>sq2){
                result[index] = sq1;
                ini++;
            }else{
                result[index] = sq2;
                fin--;
            }
            index--;
        }
        return result;
    }
}
