class Solution {
    public int findKthLargest(int[] nums, int k) {

        java.util.Arrays.sort(nums);

        return nums[nums.length - k];
        
    }
}