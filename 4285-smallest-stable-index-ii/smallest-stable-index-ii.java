class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = nums[0];
        int[] right = new int[n];
        right[n-1] = nums[n-1];
        int g = n;
        for(int i=1;i<n;i++){
            left[i] = Math.max(nums[i],left[i-1]);
            right[n-i-1] = Math.min(nums[n-i-1],right[n-i]);

        }
        for(int i=0;i<n;i++){
            if(left[i] - right[i] <= k) return i;
        }
        return -1;
    }
}