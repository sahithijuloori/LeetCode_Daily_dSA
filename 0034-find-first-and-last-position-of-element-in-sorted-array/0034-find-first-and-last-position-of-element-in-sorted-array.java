class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int l = 0;
        int h = nums.length - 1;
        int x = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (target == nums[mid]) {
                x = mid;
                h = mid - 1;
            } else if (target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        arr[0] = x;
        l = 0;
        h = nums.length - 1;
        x = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (target == nums[mid]) {
                x = mid;
                l = mid + 1;
            } else if (target < nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        arr[1] = x;
        return arr;
    }
}