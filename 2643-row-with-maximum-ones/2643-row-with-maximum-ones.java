class Solution {

    public int[] rowAndMaximumOnes(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int maxcount = 0;
        int[] index = { 0, 0 };

        for (int i = 0; i < m; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                count += mat[i][j];
            }

            if (count > maxcount) {

                maxcount = count;
                index[0] = i;
                index[1] = maxcount;

            }

        }

        return index;

    }
}