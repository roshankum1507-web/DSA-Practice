class Solution {

    public int largestsum(int[] nums, long subarrays) {

        int cntsubarrays = 1;

        long subarraysum = 0;

        for (int i = 0; i < nums.length; i++) {

            if ((subarraysum + nums[i]) <= subarrays) {

                subarraysum += nums[i];
            }

            else {

                cntsubarrays++;
                subarraysum = nums[i];
            }
        }

        return cntsubarrays;

    }

    public int splitArray(int[] nums, int k) {

        if (k > nums.length)
            return -1;

        long sum = 0;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            max = Math.max(max, nums[i]);
        }

        long low = max;
        long high = sum;

        while (low <= high) {

            long mid = (low + high) / 2;

            if (largestsum(nums, mid) > k) {

                low = mid + 1;
            }

            else {

                high = mid - 1;
            }
        }

        return (int)low;

    }
}