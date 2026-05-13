// Leetcode :- Search in Rotated Sorted Array
// Topic :- Binary Search 
// Time Complexity :- O(log n) 
// Space Complexity :- O(1)

class Solution {
    public int search(int[] a, int target) {
        int n = a.length;
        int lo = 0, hi = n - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(a[mid] == target) return mid;
            //left sorted
            if(a[lo] <= a[mid]){
                if(a[lo] <= target && a[mid] > target){
                    hi = mid - 1;
                }
                else lo = mid + 1;
            }
            //right sorted
            else{
                if(a[mid] < target && target <= a[hi]){
                    lo = mid + 1;
                }
                else hi = mid - 1;
            }
        }
        return -1;
    }
}
