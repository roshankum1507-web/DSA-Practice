class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int maximum = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;
            int l = 0;

            for(int a = 0 ; a <= i ; a++){

                maximum = Math.max(maximum , nums[a]);
            }

            for (int j = i; j < n; j++) {

               
                minimum = Math.min(minimum , nums[j]);

            }

            l = maximum - minimum;

            if(l<=k){

                return i;
            }
            
        }

        return -1;

    }
}