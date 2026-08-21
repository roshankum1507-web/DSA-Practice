class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int k = -5001;

        for(int i = 1 ; i < n ; i++){

            if(nums[i] < nums[i-1]){

                k = nums[i];

            }
        }

        if(k==-5001) return nums[0];

        return k;
        
    }
}