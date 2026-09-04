class Solution {

    public long totaltime(int[] piles , int value){

            long totalhours = 0;

            for(int i = 0 ; i<=piles.length-1; i++){

                totalhours += ((piles[i]+value-1)/value);
            }

            return totalhours;
        }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int maximum = 0;

        for (int i = 0; i < n ; i++) {

            maximum = Math.max(maximum , piles[i]);

        }

        int low = 1;
        int high = maximum;
        int answer = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            long totalhours = totaltime(piles, mid);

            if (totalhours <= h) {

                answer = mid;
                high = mid - 1;
            }

            else {

                low = mid + 1;
            }

        }

        return answer;

    }
}