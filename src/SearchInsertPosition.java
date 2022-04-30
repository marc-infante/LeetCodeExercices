
/*
Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in order.
*/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target){
        int ini,fin,med;
        ini=0;
        fin=nums.length;
        while(ini!=fin){
            med = getMedianNumber(ini,fin);
            if(nums[med]>=target){
                fin=med;
            }else{
                ini=med+1;
            }
        }
        return ini;
    }

    private int getMedianNumber(int ini, int fin) {
        return ((fin-ini)/2)+ini;
    }
}
