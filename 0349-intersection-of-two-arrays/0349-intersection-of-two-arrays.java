import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {


    HashSet<Integer>set1 = new HashSet<>();

    for(
    int i:nums1)
    {

        set1.add(i);

    }

    HashSet<Integer>set2 = new HashSet<>();

    for(
    int j:nums2)
    {

        if (set1.contains(j)) {

            set2.add(j);
        }
    }

    int[] intersection = new int[set2.size()];

    int i = 0;

    for(
    int k:set2){

            intersection[i++] = k;
        }

    return intersection;

}
}

