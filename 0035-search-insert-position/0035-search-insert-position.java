class Solution {
    public int searchInsert(int[] nums, int target) {

        int k = 1;

        for (int i = 0; i < nums.length; i++) {

            if (target == nums[i]) {

                return i;
            }

            else if (target > nums[i]) {

                k = i;

            }

            else if (target < nums[0]){

                return k - 1;
            }

            

        }

        return k + 1;

    }
}