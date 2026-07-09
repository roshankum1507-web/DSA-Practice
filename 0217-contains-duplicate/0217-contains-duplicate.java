import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer , Integer>mpp = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){

            int num = nums[i];

            int count = mpp.getOrDefault(num , 0);

            count +=1;

            if (count > 1){

                return true;
            }

            mpp.put(num , count);
        }

        return false;


        
    }
}