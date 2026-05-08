// Leetcode:- Majority Element
// Topic:- Arrays
// Time Complexity:- O(n)
// Space Complexity:- O(n)


class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0) ele = nums[i];
            if(nums[i] == ele) count++;
            else count--;
        }
        return ele;
    }
}

