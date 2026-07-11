import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> mpp = new HashMap<>();

        for (int num : nums) {

            int count = mpp.getOrDefault(num, 0) + 1;
            mpp.put(num, count);

            if (count > nums.length / 2) {

                return num;
            }
        }
      return -1;
    }
}