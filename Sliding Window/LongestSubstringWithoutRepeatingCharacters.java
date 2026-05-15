// Leetcode :- Longest Substring Without Repeating Characters
// Topic :- Sliding Window
// Time Complexity :- O(n)
// Space Complexity :- O(1)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int left = 0, max = 0;
        for(int right = 0; right < s.length(); right++){
            if(st.contains(s.charAt(right))){
                while(st.contains(s.charAt(right))){
                    st.remove(s.charAt(left));
                    left++;
                }
            }
            else{
                max = Math.max(max, right - left + 1);
            }
            st.add(s.charAt(right));
        }
        return max;
    }
}
