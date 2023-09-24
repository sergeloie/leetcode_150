// https://leetcode.com/problems/remove-duplicates-from-sorted-array
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;
        int end = nums.length - 1;

        while (r < end) {
            r++;
            if (nums[l] < nums[r]) {
                nums[l + 1] = nums[r];
                l++;
            }
        }
        return l + 1;
    }
}
