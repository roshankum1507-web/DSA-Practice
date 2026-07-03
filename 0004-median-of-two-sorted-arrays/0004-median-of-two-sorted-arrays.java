class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merge = new int[nums1.length + nums2.length];

        int idx = 0;

        for (int i = 0; i <= nums1.length - 1; i++) {

            merge[idx] = nums1[i];

            idx++;
        }

        for (int i = 0; i <= nums2.length - 1; i++) {

            merge[idx] = nums2[i];

            idx++;
        }

        for( int i = 0 ; i<=merge.length-1 ; ++i){

            int j = i;

            while( j > 0 && merge[j-1] > merge[j]){

                int temp = merge[j-1];

                merge[j-1] = merge[j];

                merge[j] = temp;

                j--;


            }
        }

        if (merge.length % 2 != 0) {

            return merge[(merge.length - 1) / 2];
        }

        else if (merge.length % 2 == 0) {

            return (merge[(merge.length - 1) / 2] + merge[(merge.length / 2)]) / 2.0;
        }

        return 0;

    }

}