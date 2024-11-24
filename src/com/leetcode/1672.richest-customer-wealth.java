package com.leetcode;/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }
    // time complexity = O(n * m)
    // space complexity = O(1)
}
// @lc code=end
