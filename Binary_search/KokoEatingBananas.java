// Leetcode :- Koko Eating Bananas
//Topic :- Binary Search on Answer
// Time Complexity :- O(n * log n)
// Space Complexity :- O(1)



class Solution {
    public int check(int n, int[] a){
        int hr = 0;
        for(int i = 0; i < a.length; i++){
            hr += Math.ceil((double)a[i] / n);
        }
        return hr;
    }
    public int minEatingSpeed(int[] a, int h) {
        int max = Integer.MIN_VALUE;
        for(int x : a){
            if(x > max) max = x;
        }
        int lo = 1, hi = max, ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int ch = check(mid, a);
            if(ch <= h){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }
}
