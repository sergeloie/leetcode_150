/*
https://leetcode.com/problems/rotate-array/

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int step = gcdByEuclidsAlgorithm(size, k);
        if (step == 1) {
            chainMove(nums, k, 0);
        } else {
            for (int i = 0; i < step; i++) {
                chainMove(nums, k, i);
            }
        }
    }

    public void chainMove(int[] nums, int k, int index) {
        int size = nums.length;
        k = k % size;
        int i = index;
        int j = (index + k) % size;
        int prev = nums[i];
        int next = nums[j];
        do {
            nums[j] = prev;
            prev = next;
            i = (i + k) % size;
            j = (j + k) % size;
            next = nums[j];
        } while (i != index);
    }

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
