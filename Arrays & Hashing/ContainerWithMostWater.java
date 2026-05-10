// Leetcode :- Container With Most Water
// Topic :- Arrays, Two Pointers
// Time Complexity :- O(n)
// Space Complexity :- O(1)

class Solution {
    public int maxArea(int[] a) {
        int l = 0, r = a.length - 1;
        int max = 0;

        while (l <= r) {
            int count = Math.min(a[l], a[r]) * (r - l);
            max = Math.max(max, count);

            if (a[l] < a[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}
