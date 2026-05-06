class Solution {
    public int[] twoSum(int[] a, int target) {
        int[] ans = {-1, -1};
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            if(mp.containsKey(target - a[i])){
                ans[0] = mp.get(target - a[i]);
                ans[1] = i;
                return ans;
            }
            mp.put(a[i], i);
        }
        return ans;
    }
}