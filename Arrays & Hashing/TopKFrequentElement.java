// Topic:- Arrays
// Leetcode:- Top K Frequent Elements
// Time complexity:- O(n)
// Space Complexity:- O(n)

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] lst = new List[nums.length + 1];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for(int key : mp.keySet()){
            int freq = mp.get(key);
            if(lst[freq] == null){
                lst[freq] = new ArrayList<>();
            }
            lst[freq].add(key);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i = lst.length - 1; i >= 0 && idx < k; i--){
            if(lst[i] != null){
                for(int num : lst[i]){
                    ans[idx++] = num;
                    if(idx == k){
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
