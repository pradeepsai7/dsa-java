// Leetcode :- Contains Duplicate II
// Topic :- Arrays, Sliding Window, Hashing
// Time Complexity :- O(n)
// Space Complexity :- O(k)

class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        int left = 0;
        HashSet<Integer> st = new HashSet<>();
        for(int right = 0; right < a.length; right++){
            if(right - left > k){
                st.remove(a[left]);
                left++;
            }
            if(st.contains(a[right])) return true;
            st.add(a[right]);
        }
        return false;
    }
}
