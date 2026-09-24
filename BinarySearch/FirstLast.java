/*
34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
If target is not found, return [-1, -1].
*/

class FirstLast {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 3, 4, 4, 5};
        int target = 3;

        System.out.println(java.util.Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);

        return result;
    }

    public static int search(int[] nums, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}


