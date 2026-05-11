// Leetcode :- Single Element in a Sorted Array
//Topic :- Binary Search
// Time Complexity :- O(log n)
// Space Complexity :- O(1)


class Solution {
    public int singleNonDuplicate(int[] a) {
        int n = a.length;
        if(n == 1) return a[0];
        if(a[0] != a[1]) return a[0];
        if(a[n - 1] != a[n - 2]) return a[n - 1];
        int lo = 0, hi = n - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(a[mid] != a[mid + 1] && a[mid] != a[mid - 1]){
                return a[mid];
            }
            else if((a[mid] == a[mid + 1] && mid % 2 == 0) || (a[mid] == a[mid - 1] && mid % 2 != 0)){
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return -1;
    }
}
