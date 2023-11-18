#include<bits/stdc++.h>
using namespace std;
/*
Problem Name : 1636. Sort Array by Increasing Frequency
Problem Link : https://leetcode.com/problems/sort-array-by-increasing-frequency/
Explanation : We to have to sort in terms of the values also store the values with 
thier index and then sort them in decreasing order and then use the index to get the.
And the noticeable thing is that we only have to store the row index and then store the value in the 
ans array.
Time Complexity : O(nlogn) + O(n^2) = O(n^2)
Space Complexity : O(n^2) + O(nlogn) = O(n^2)
*/
class Solution {
public:
    vector<vector<int>> sortTheStudents(vector<vector<int>>& score, int k) {
        int sizeOfNums = score.size();
        int row = sizeOfNums;
        int col = score[0].size();

        vector<pair<int, int>> temp;
        for (int i = 0; i < sizeOfNums; i++) {
            temp.push_back({score[i][k], i});
        }
        
        sort(begin(temp), end(temp), greater<pair<int, int>>());

        vector<vector<int>> ans(row, vector<int>(col));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = score[temp[i].second][j];
            }
        }
        return ans;
    }
};
 
int main() {
    Solution sol;
    vector<vector<int>> score = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
    int k = 1;
    vector<vector<int>> ans = sol.sortTheStudents(score, k);
    for (auto i : ans) {
        for (auto j : i) {
            cout << j << " ";
        }
        cout << endl;
    }
    return 0;
}