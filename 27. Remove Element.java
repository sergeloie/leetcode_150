// https://leetcode.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] != val) {
                left++;
            } else {
                nums[left] = nums[right];
                right--;
            }
        }
        return left;
    }
}
