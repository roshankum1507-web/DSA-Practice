class Solution {

    public boolean possible(int[] bloomday, int days, int m, int k) {

        int n = bloomday.length;
        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < n; i++) {

            if (bloomday[i] <= days) {

                count++;
            }

            else {

                bouquets += (count / k);
                count = 0;
            }
        }

        bouquets += (count / k);

        if (bouquets >= m)
            return true;

        return false;

    }

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        long product = (long)m * k;

        if (n < product){

            return -1;
        }
           

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);

        }

        int low = min;
        int high = max;
        int answer = max;

        while (low <= high) {

            int mid = (low + high) / 2;

            boolean result = possible(bloomDay , mid , m , k);

            if (result == true) {

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