
/*
difficulty: easy

Given an integer array nums, move all 0's to the end of it while maintaining the relative
order of the non-zero elements.
*/

public class MoveZeroes {

    public void moveZeroes1(int[] nums) {
        int firstZeroIndex=-1;
        int index=0;
        while(index<nums.length){
            if(nums[index]==0 && firstZeroIndex==-1){
                firstZeroIndex = index;
            }else if(nums[index]!=0 && firstZeroIndex != -1){
                nums[firstZeroIndex] = nums[index];
                nums[index] = 0;
                index = firstZeroIndex;
                firstZeroIndex = -1;
            }
            index++;
        }
    }

    // Best solution
    public void moveZeroes2(int[] nums) {
        int index = 0;

        // Fill all non-zero numbers at the beggining
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }

        // Fill last positions with zero
        for(int i=index; i<nums.length; i++){
            nums[i]=0;
        }
    }
}
