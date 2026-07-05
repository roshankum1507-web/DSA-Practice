class Solution {
    public void moveZeroes(int[] nums) {

        int z = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                nums[z] = nums[i];
                z++;
            }

        }

        for (int i = z; i < nums.length; i++) {

            nums[i] = 0;
        }
    }
}