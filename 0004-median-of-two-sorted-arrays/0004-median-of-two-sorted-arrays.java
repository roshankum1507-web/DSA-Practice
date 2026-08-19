class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] mergearray = new int[m + n];

        int i = 0;

        int j = 0;

        int k = 0;

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {

                mergearray[k] = nums1[i];
                i++;
                k++;
            }

            else {

                mergearray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < m) {

            mergearray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {

            mergearray[k] = nums2[j];
            j++;
            k++;
        }

        int total = m + n;

        if (total % 2 == 0) {

            double median1 = (mergearray[(total - 2) / 2] + mergearray[total / 2]) / 2.0;

            return median1;
        }

        else if (total % 2 != 0) {

            double median2 = mergearray[total / 2];
            return median2;
        }

        return -1;

    }
}