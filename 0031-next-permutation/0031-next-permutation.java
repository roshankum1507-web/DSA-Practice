import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int idx = -1;

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {

                idx = i;
                break;
            }
        }

        if (idx == -1) {

            int l = 0 ; 
            int r = n-1 ;

            while (l < r){

                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }

            return;

            
        }

        for (int i = n - 1; i >= idx; i--) {

            if (nums[i] > nums[idx]) {

                int temp = nums[i];

                nums[i] = nums[idx];

                nums[idx] = temp;

                break;
            }
        }

        int left = idx + 1;
        int right = n - 1;

        for (int i = left, j = right; i < j; i++, j--) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }
}