class Solution {
    public int reverse(int x) {

        int n = 0;

        while (x != 0) {

            int z = x % 10;

            x = x / 10;

            if (n > Integer.MAX_VALUE / 10 || (n == Integer.MAX_VALUE && z > 7)) {

                return 0;
            }

            if (n < Integer.MIN_VALUE / 10|| (n == Integer.MIN_VALUE && z < -8)) {

                return 0;
            }

            n = (n * 10) + z;

        }

        return n;

    }
}