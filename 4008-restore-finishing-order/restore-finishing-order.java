class Solution {
    public int[] recoverOrder(int[] order, int[] fri) {
        int n = fri.length;
        int[] ans = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
                set.add(fri[i]);
        }
        int m = order.length;
        int ct = 0;
        for(int i=0;i<m;i++){
            if(set.contains(order[i])) ans[ct++] = order[i];
        }
        return ans;
    }
}