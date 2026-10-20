class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target) ans.add(i);
        }
        return ans;
    }
}