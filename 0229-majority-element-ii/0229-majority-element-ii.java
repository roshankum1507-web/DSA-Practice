class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer , Integer>map = new HashMap<>();

        List<Integer>list = new ArrayList<>();

        for(int num : nums){

            int count = map.getOrDefault(num , 0) + 1;
            map.put(num , count);

            if(count > nums.length/3 && !list.contains(num)){

                list.add(num);
            }
        }

        return list;
        
    }
}