class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){

            int mid = (low + high)/2;

            if(nums[mid]==nums[low] && nums[mid]==nums[high]){

                high = high - 1;
                low = low + 1;
                continue;

            }

            if(nums[mid]>nums[high]){

                low = mid+1 ;
            }

            else{

                high = mid;
            }
        }

        return nums[low - 1];
        
    }
}