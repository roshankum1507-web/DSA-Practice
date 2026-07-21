class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>value = new HashSet<>();

        for(int num : nums){

            value.add(num);
        }

        int maxlen = 0;

        for(int val : value){

            if(!value.contains(val - 1)){

                int curval = val;
                int len = 1;

                while(value.contains(curval + 1)){

                    curval += 1;

                    len += 1;

                    
                }

                maxlen = Math.max(maxlen , len);
            }
        }

        return maxlen;

       
    }
}