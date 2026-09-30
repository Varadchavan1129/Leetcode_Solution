class Solution {
    public int[] maxDepthAfterSplit(String s) {
        int n = s.length();
        int[] arr = new int[n];

        int depth = 0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                depth++;
                arr[i] = depth % 2;
            }
            else{
                arr[i] = depth % 2;
                depth--;
            }
        }
        return arr;
    }
}