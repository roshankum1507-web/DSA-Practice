import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {

        Map<Integer, Integer> map1 = new HashMap<>();

        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {

            sum1 += nums[i];

            map1.put(i, sum1);
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        int sum2 = 0;
        for (int j = nums.length - 1; j >= 0; j--) {

            sum2 += nums[j];

            map2.put(j, sum2);

        }

        for(int i = 0 ; i<nums.length ; i++){
            
            int left= 0;
            if(i==0){

                left =0 ;
            }

            else{

                left = map1.get(i-1);
            }

            int right;

            if(i == nums.length-1){

                right =0;

            }

            else{

                right = map2.get(i+1);
            }

            if(left == right){

                return i;

            }
        }

        return -1;

    }
}