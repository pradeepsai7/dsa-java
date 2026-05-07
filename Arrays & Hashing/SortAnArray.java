// Topic:- Arrays
// Leetcode:- Sort an Array
// Time Complexity:-O(n * log n)
// Space Complexity:-O(n)

class Solution {
    int[] temp;
    public void merge(int[] a, int lo, int mid, int hi){
        int left = lo, right = mid + 1, idx = 0;
        while(left <= mid && right <= hi){
            if(a[left] <= a[right]){
                temp[idx++] = a[left++];
            }
            else{
                temp[idx++] = a[right++];
            }
        }
        while(left <= mid){
            temp[idx++] = a[left++];    
        }
        while(right <= hi){
            temp[idx++] = a[right++];    
        }
        for(int i = lo; i <= hi; i++){
            a[i] = temp[i - lo];
        }
    }
    public void mergeSort(int[] a, int lo, int hi){
        if(lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
