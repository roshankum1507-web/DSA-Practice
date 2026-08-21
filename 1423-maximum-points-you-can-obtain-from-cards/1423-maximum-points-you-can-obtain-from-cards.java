class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftsum = 0;

        for(int i = 0 ; i<k ;i++){

            leftsum+=cardPoints[i];
        }

        int maximumsum = leftsum;

        int right = cardPoints.length-1;
        int rightsum = 0;

        for(int i = k-1 ; i >=0 ; i--){

            leftsum -= cardPoints[i];
            rightsum += cardPoints[right];
            right--;

            maximumsum = Math.max(maximumsum , leftsum + rightsum);
        }

        return maximumsum;

        

    }
}