#include<bits/stdc++.h>
using namespace std;
/*
Tracerse from both sides and check if the sum is equal to target then return the indices
else if the sum is less than target then increment the left pointer
else if the sum is greater than target then decrement the right pointer
Time complexity : O(n)
Space complexity : O(1) // This was the constraint in the question thtat constant should be used
*/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        int i = 0 ;
        int j = n - 1 ;
        vector<int> ans(2);
        while(i < j){
            if(nums[i]+nums[j] == target){
                ans[0] = i+1 ;
                ans[1] = j+1 ;
                break;
            }else if(nums[i]+nums[j] < target){
                i++;
            }else if(nums[i]+nums[j] > target){
                j--; 
            }
        }
        return ans;
    }
};

int main(){
    Solution s;
    vector<int> nums = {2,7,11,15};
    int target = 9;
    vector<int> ans = s.twoSum(nums,target);
    cout<<ans[0]<<" "<<ans[1]<<endl;
    return 0;
}