// Leetcode :- Best Time to Buy and Sell Stock
// Topic :- Arrays
// Time Complexity :- O(n)
// Space Complexity :- O(1)

class Solution {
    public int maxProfit(int[] a) {
        int ans = 0, buy = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < buy) buy = a[i];
            ans = Math.max(ans, a[i] - buy);
        }
        return ans;
    }
}
