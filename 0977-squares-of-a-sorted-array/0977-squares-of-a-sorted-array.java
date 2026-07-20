class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] square = new int[nums.length];

        for (int i = 0 ; i < nums.length ; i++) {

            square[i] = nums[i] * nums[i];
        }

        for (int i = 1 ; i < square.length ; i++) {

            int j = i;

            while (j > 0 && square[j - 1] > square[j]) {

                int temp = square[j - 1];
                square[j - 1] = square[j];
                square[j] = temp;
                j--;
            }

        }

        return square;

    }
}