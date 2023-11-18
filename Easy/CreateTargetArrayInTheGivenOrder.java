import java.util.ArrayList;
/*
    Problem name : Create Target Array in the Given Order
    Problem Link : https://leetcode.com/problems/create-target-array-in-the-given-order/
    Problem Statement: 
        Given two arrays of integers nums and index. Your task is to create target array under the following rules:
        Initially target array is empty.
        From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
        Repeat the previous step until there are no elements to read in nums and index.
        Return the target array.
        It is guaranteed that the insertion operations will be valid.
    Constraints:
        1 <= nums.length, index.length <= 100
        nums.length == index.length
        0 <= nums[i] <= 100
        0 <= index[i] <= i
 */
public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        Solution obj = new Solution();
        int[] ans = obj.createTargetArray(nums, index);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int sizeOfNums = nums.length;
        int[] ans = new int[sizeOfNums];
        ArrayList<Integer> lst = new  ArrayList<Integer>();
        for(int i = 0 ; i < sizeOfNums ; i++){
            lst.add(index[i],nums[i]);
        }
        for(int i = 0 ; i < sizeOfNums ; i++){
            ans[i] = lst.get(i);
        }
        return ans;
    }
}
