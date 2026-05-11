// Leetcode :- Separate the Digits in an Array
// Topic :- Arrays
// Time Complexity :- O(d), where d is number of digits
// Space Complexity :- O(d), where d is number of digits


class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int num : nums){
            sb.append(num);
        }
        int[] ans = new int[sb.length()];
        for(int i = 0; i < sb.length(); i++){
            ans[i] = (sb.charAt(i) - '0');
        }
        return ans;
    }
}