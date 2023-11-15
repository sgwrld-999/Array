#include<bits/stdc++.h>
using namespace std;

/*
Problem name : Number of Employees Who Have Undergone Training
Problem link : https://leetcode.com/problems/number-of-employees-who-have-undergone-training/
Description : Given a table Employees, which has three columns: Employee, Training, and Salary.
              Write a SQL query to find the number of employees who have undergone training such that there is no salary greater than their salary in the training table.
              Return the result table in any order.
*/

//Approach 1 
class Solution1 {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& hours, int target) {
        int ctr = 0;
        for(int i = 0 ; i < hours.size() ; i++){
            if(hours[i] >= target)ctr++;
        }
        return ctr;
    }
};
//Approach 2
//Time complexity : O(nlogn)
//Space complexity : O(1)
//This approach is based on the fact that if the array is sorted then we can use binary search to find the number of elements greater than or equal to the target
//Finding the lower bound of the target will give us the number of elements greater than or equal to the target
class Solution2 {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& hours, int target) {
        sort(hours.begin(),hours.end());
        return (hours.end() - lower_bound(hours.begin(),hours.end(),target));
    }
};


int main(){
    Solution1 s;
    vector<int> hours = {2,3,5,6,8,10};
    int target = 5;
    cout<<s.numberOfEmployeesWhoMetTarget(hours,target)<<endl;
    return 0;
}