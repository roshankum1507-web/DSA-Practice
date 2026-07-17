class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] pos = new int[n/2];
        int[] neg = new int[n/2];

        int positive = 0;

        int negative = 0;

        for( int i = 0 ; i < nums.length ; i++){

            if(nums[i]>=0){

                pos[positive] = nums[i];

                positive += 1;
            }

            else if(nums[i] < 0){

                neg[negative] = nums[i];
                negative +=1 ;
            }
        }

        for(int i = 0 ; i < n/2 ; i++){

            nums[2*i] = pos[i];

            nums[2*i+1] = neg[i];

           
        
    }
    return nums;
    }
}