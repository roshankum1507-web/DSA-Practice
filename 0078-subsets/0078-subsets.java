class Solution {
    public void subsequences(int idx, int[] arr, List<List<Integer>> subarr, List<Integer> ds) {

        if (idx == arr.length) {

            subarr.add(new ArrayList<>(ds));
            return;
        }

        ds.add(arr[idx]);
        subsequences(idx + 1, arr, subarr, ds);
        ds.remove(ds.size()-1);
        subsequences(idx + 1, arr, subarr, ds);

    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subarr = new ArrayList<>();

        subsequences(0, nums, subarr, new ArrayList<>());

        return subarr;

    }
}