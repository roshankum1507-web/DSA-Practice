class Solution {
    public int thirdMax(int[] nums) {

        for(int i = 1 ; i < nums.length ; i++){

            int j = i;

            while(j>0 && nums[j-1] > nums[j]){

                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;

                j--;

            }
        }

        int count = 0;
        Integer last = null;

        for(int i = nums.length - 1 ; i >=0 ; i--){

            if(last == null || nums[i] != last){

                count++;
                last = nums[i];

                if(count == 3){

                    return nums[i];
                }
            
            }
        }

       
        return nums[nums.length - 1];

        
    }
}