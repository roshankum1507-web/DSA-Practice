class Solution {
    public int singleNonDuplicate(int[] nums) {

        Map<Integer, Integer>map = new HashMap<>();

        for(int num : nums){

            int count = map.getOrDefault(num , 0) + 1;

           
            map.put(num , count);
        }


        for(Map.Entry<Integer , Integer>entry : map.entrySet()){

            if(entry.getValue() == 1){

                return entry.getKey();
            }


        }

        return -1;
        
    }
}