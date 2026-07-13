class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m ; i<m+n; i++){

            nums1[i] = nums2[i-m];
        }

        for(int i = 1 ; i <m+n ; i++){

            int j = i;

            while(j > 0 && nums1[j-1] > nums1[j]){

                int temp = nums1[j-1];

                nums1[j-1] = nums1[j];

                nums1[j] = temp;

                j--;
            }
        } 
        
    }
}