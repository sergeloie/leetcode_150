/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/
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
