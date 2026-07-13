class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        for(int i = 1 ; i<nums.length; i++){

            int j = i;

            while(j > 0 && nums[j-1] > nums[j]){

                int temp = nums[j-1];

                nums[j-1] = nums[j];

                nums[j] = temp;

                j--;
            }
        }

        List<Integer>list = new ArrayList<>();

        for(int i = 0 ; i <nums.length ; i++){

            if(nums[i] == target){

                list.add(i);

            }

        }

        return list;
        
    }
}