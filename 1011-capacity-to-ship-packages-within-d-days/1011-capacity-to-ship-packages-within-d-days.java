class Solution {
    public int daysrequired(int[] weights, int day) {

        int n = weights.length;

        int din = 1;
        int load = 0;

        for (int i = 0; i < n; i++) {

            if ((load + weights[i]) > day) {

                din++;
                load = weights[i];
            }

            else {

                load += weights[i];
            }
        }

        return din;

    }

    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            sum += weights[i];
            max = Math.max(max, weights[i]);
        }

        int low = max;
        int high = sum;
        int answer = sum;

        while (low <= high) {

            int mid = (low + high) / 2;

            int dayrequired = daysrequired(weights, mid);

            if (dayrequired <= days) {

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