// LeetCode:- Contains Duplicate
// Pattern:- Arrays & Hashing
// Time Complexity:- O(n)
// Space Complexity:- O(n)

class Solution {
    public boolean containsDuplicate(int[] a) {
        HashSet<Integer> st = new HashSet<>();
        for(int num : a){
            if(st.contains(num)) return true;
            st.add(num);
        }
        return false;
    }
}
