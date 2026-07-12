class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int left = 1;
        for(int i = 0 ; i<answer.length ; i++){

            answer[i] = left;

            left*=nums[i];
        }

        int right = 1;

        for(int i  = answer.length-1 ; i>=0 ; i--){

            answer[i] *= right;

            right*=nums[i];
        }

        return answer;

    }
}