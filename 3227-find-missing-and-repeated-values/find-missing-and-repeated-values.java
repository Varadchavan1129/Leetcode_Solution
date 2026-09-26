class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int m = arr[0].length;
        int a = 0;
        int b = 0;
        int total = n *n;
        int expsum = total * (total+1)/2;
        int act = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(arr[i][j])){
                    a = arr[i][j];
                }
                else {
                    set.add(arr[i][j]);
                }
                act  += arr[i][j];
            }
        }

        b = expsum - act + a;
        ans[0] = a;
        ans[1] = b;
        return ans;

    }
}