class Solution {

    public boolean possible(int[] nums, int divisor, int threshold) {

        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += ((nums[i] + divisor - 1) / divisor);
        }

        if (sum <= threshold)
            return true;

        return false;

    }

    public int smallestDivisor(int[] nums, int threshold) {

        int n = nums.length;

        int max = Integer.MIN_VALUE;
        

        for(int i = 0 ; i < n ; i++){

            max = Math.max(max , nums[i]);
            

        }


        int low = 1;
        int high = max;
        int answer = high;

        while(low<=high){

            int mid = (low+high)/2;

            if(possible(nums , mid ,threshold) == true){

                answer = mid;
                high = mid-1;

            }

            else{

                low = mid+1;
            }
        }

        return answer;

    }
}