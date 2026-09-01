class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        for(int i = 0 ; i <= n-1; i++){

            int low = i+1;
            int high = n-1;
            int j = target - numbers[i];

            while(low<=high){

                int mid = (low+high)/2;

                if(numbers[mid] == j){

                    return new int[] {i+1 , mid+1};
                }

                else if(numbers[mid] > j){

                    high = mid-1;
                }

                else{

                    low = mid + 1;
                }
            }
        }

        return new int[] {};

    }
}