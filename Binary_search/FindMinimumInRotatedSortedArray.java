// Leetcode :- Find Minimum in Rotated Sorted Array
// Topic :- Binary Search
// Time  Complexity :- O(log n)
// Space  Complexity :- O(1)

class Solution {
    public int findMin(int[] a) {
        int n = a.length;
        if(a[0] <= a[n - 1]) return a[0];
        int lo = 0, hi = n - 1;
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(a[mid] > a[hi]){
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        return a[lo];
    }
}
