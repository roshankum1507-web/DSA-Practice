class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {

            sum1 += mat[i][i];

        }
    

    int i = 0;
    int j = m-1;

    while(i<n && j >=0)
    {

        sum2 += mat[i][j];
        j--;
        i++;
    }

    int sum = sum1 + sum2;

    if(n%2==1){

        sum-=mat[n/2][m/2];
    }

    return sum;

}}