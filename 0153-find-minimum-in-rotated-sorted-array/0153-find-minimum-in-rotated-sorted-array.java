class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int k = Integer.MIN_VALUE;

        for(int i = 1 ; i < n ; i++){

            if(nums[i] < nums[i-1]){

                k = nums[i];

            }
        }

        if(k==Integer.MIN_VALUE) return nums[0];

        return k;
        
    }
}