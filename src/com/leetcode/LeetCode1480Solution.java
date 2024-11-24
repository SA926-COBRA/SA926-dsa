package com.leetcode;/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class LeetCode1480Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i - 1];
        }
        return results;
    }
    // time complexity = O(n)
    // space complexity = O(1)
}
// @lc code=end
