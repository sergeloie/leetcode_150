/*
https://leetcode.com/problems/jump-game/

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
*/

class Solution {
public static boolean canJump(int[] nums) {
        boolean isReachable = false;
        int rIndex = nums.length - 1;

        if (nums.length == 1) {
            return true;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= rIndex - i) {
                isReachable = true;
                rIndex = i;
            } else {
                isReachable = false;
            }
        }
        return isReachable;
    }
}
