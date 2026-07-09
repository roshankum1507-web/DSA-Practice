class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;

        int maximum = Integer.MIN_VALUE;

        for (int i : nums) {

            sum  = Math.max(i , sum+i);

            maximum = Math.max(maximum, sum);

        }

        return maximum;

    }
}