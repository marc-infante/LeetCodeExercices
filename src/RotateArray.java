
/*
difficulty: medium

Given an array, rotate the array to the right by k steps, where k is non-negative.
*/

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k%=nums.length;
        if(k>0) {
            // Rotate first chunk in reverse order
            reverse(nums,0,nums.length-1-k);

            // Rotate second chunk in reverse order
            reverse(nums,nums.length-k,nums.length-1);

            // Rotate all array in reverse order
            reverse(nums,0,nums.length-1);
        }
    }

    private void reverse(int[] nums, int ini, int fin){
        int aux;
        while(ini<fin){
            aux = nums[ini];
            nums[ini]=nums[fin];
            nums[fin]=aux;
            ini++;
            fin--;
        }
    }

}
