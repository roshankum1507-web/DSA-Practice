class Solution {
    public int maxProduct(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for(int i = 0 ; i< nums.length ; i++){

            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix*=nums[i];
            suffix*=nums[nums.length - i - 1];

            maximum = Math.max(maximum , Math.max(prefix , suffix));
        }

        return maximum;

        
}
}