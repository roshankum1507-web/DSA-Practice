class Solution {
    public void rotate(int[] nums, int k) {

        int[] combine = new int[nums.length];

        if(nums.length == 0){

            return ;
        }

        k = k% nums.length;

        for (int i = 0; i < k; i++) {

            combine[i] = nums[combine.length-k+i];

        }

        for (int i = k; i < combine.length; i++) {

            combine[i] = nums[i - k];

        }

        for(int i = 0 ; i < combine.length ; i++){

            nums[i] = combine[i];
        }

    }
}