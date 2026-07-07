class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int x = 0;
        int maxm = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {

                x++;

                maxm = Math.max(maxm, x);

            }

            else {
                x = 0;
            }

        }

        return maxm;

    }

}