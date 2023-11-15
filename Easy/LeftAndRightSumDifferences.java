/*
Problem Name : Left and Right Sum Differences
Problem Link : https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
Problem Statement: 
    You are given an integer array nums sorted in non-decreasing order.
    Build and return an integer array result with the same length as nums such that result[i] is equal to the summation of absolute differences between nums[i] and all the other elements in the array.
    In other words, result[i] is equal to sum(|nums[i]-nums[j]|) where 0 <= j < nums.length and j != i (0-indexed).
 */
// Solution 1 : Brute Force Approach
// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length; 
        int[] leftSum = new int[len]; 
        int[] rightSum = new int[len]; 
        int[] ans = new int[len]; 

        leftSum[0] = 0;
        rightSum[len - 1] = 0;
        for (int i = 1; i < len; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];  
            rightSum[len - 1 - i] = rightSum[len - i] + nums[len - i]; 
        }
        for (int i = 0; i < len; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        Solution obj = new Solution();
        int[] ans = obj.leftRightDifference(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}