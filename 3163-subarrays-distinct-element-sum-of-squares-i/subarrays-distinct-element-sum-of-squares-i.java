class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans =0;
        int n = nums.size();
        if(n ==1) return 1;
        for(int i=0;i<n;i++)
        {
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++)
            {
                set.add(nums.get(j)); 
                int m = set.size();
                ans += (m*m);
            }
        }
        return ans;
    }
}