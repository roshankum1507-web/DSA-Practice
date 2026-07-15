class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int globalMax = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            
            int tempMax = Math.max(num, Math.max(currentMax * num, currentMin * num));
            currentMin = Math.min(num, Math.min(currentMax * num, currentMin * num));
            currentMax = tempMax;

            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

}