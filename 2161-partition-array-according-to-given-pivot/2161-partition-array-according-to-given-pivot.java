class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int num : nums) {

            if (num < pivot) {
                list1.add(num);
            }

            else if (num == pivot) {
                list2.add(num);
            }

            else if (num > pivot) {

                list3.add(num);
            }
        }

        int[] arr = new int[n];

        int index = 0;

        for (int i : list1) {

            arr[index] = i;
            index++;

        }

        for (int i : list2) {

            arr[index] = i;

            index++;
        }

        for (int i : list3) {

            arr[index] = i;

            index++;
        }

        for (int i = 0; i < n; i++) {

            nums[i] = arr[i];
        }

        return nums;

    }
}