// Leetcode :- Capacity To Ship Packages Within D Days
//Topic :- Binary Search on Answer
// Time Complexity :- O(n * log n)
// Space Complexity :- O(1)


class Solution {
    public int check(int n, int[] a){
        int days = 1, load = 0;
        for(int i = 0; i < a.length; i++){
            if(load + a[i] > n){
                days++;
                load = a[i];
            }
            else{
                load += a[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int x : weights){
            if(x > max) max = x;
            sum += x;
        }
        int lo = max, hi = sum, ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int ch = check(mid, weights);
            if(ch <= days){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }
}