class Solution {

    public boolean binarysearch(int[] matrix, int target) {

        int n = matrix.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (matrix[mid] == target) {

                return true;
            }

            else if (matrix[mid] > target) {

                high = mid - 1;
            }

            else {

                low = mid + 1;
            }

        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        boolean result = false;

        for (int i = 0; i < m; i++) {

            if (matrix[i][0] <= target && matrix[i][n - 1] >= target) {

                result = binarysearch(matrix[i], target);
                if (result == false) {

                    continue;
                }

                return result;
            }

        }

        return false;

    }
}