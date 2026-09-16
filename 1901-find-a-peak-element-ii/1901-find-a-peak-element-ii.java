class Solution {
    public int binarysearch(int[][] mat , int col){

        int m = mat.length;
        int maxvalue = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0 ; i < m ; i++){

            if(mat[i][col] > maxvalue){
                maxvalue = mat[i][col];
                index = i;
            }


        }

        return index;
    }

    public int[] findPeakGrid(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int row = binarysearch(mat, mid);

            int left = -1;
            int right = -1;

            if (mid - 1 >= 0) {

                left = mat[row][mid - 1];
            }

            if (mid + 1 < n) {

                right = mat[row][mid + 1];
            }

            if (mat[row][mid] > left && mat[row][mid] > right) {

                return new int[] { row, mid };
            }

            else if (mat[row][mid] < left) {

                high = mid - 1;
            }

            else {

                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };

    }
}