import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] index = new int[]{-1 , -1};

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] == target){

                if(index[0] == -1){

                    index[0] = i;
                }
                index [1] =i;
            }
        }

        return index;

        

        
        
    }
}