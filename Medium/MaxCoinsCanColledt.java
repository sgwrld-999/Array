import java.util.*;

/*
 * Problem name : Maximum Number of Coins You Can Get
 * Problem link : https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
 * Explanation : 
 * Using greedy approach we can solve this problem.
 * We can sort the array and then we iterate over the array from the end and start picking the second last element and then the last element and then the third last element and so on.
 * We can do this because we know that the second last element will be the smallest element in the array and the last element will be the second smallest element in the array.
 * So we can pick the second last element and the last element and then we can pick the third last element and the second last element and so on.
 * 
 */
class Solution1 {
    public int maxCoins(int[] arr) {
        Arrays.sort(arr);
        int bob = 0 ; 
        int you = arr.length - 2 ;
        int alice = arr.length - 1 ;
        int ans = 0 ;
        while(bob < you && bob < alice){
            ans += arr[you];
            you -= 2;
            bob++;
            alice-= 2;
        }
        return ans;
    }
}

class Solution2 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;

        for (int i = piles.length / 3; i < piles.length; i += 2) {
            res += piles[i];
        }

        return res;        
    }
}