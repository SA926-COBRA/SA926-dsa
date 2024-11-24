package com.leetcode;/*
 * @lc app=leetcode id=1342 lang=java
 *
 * [1342] Number of Steps to Reduce a Number to Zero
 */

// @lc code=start
class LeetCode1342Solution {
    public int numberOfSteps(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 0)
                n /= 2;
            else
                n -= 1;
            ans++;
        }
        return ans;
    }
}
// @lc code=end
