class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int tot = 0;
        for(char ch : s.toCharArray()){
            
            if(ch=='(') {
                tot++;
                max = Math.max(tot,max);
            }
            else if(ch==')'){
                tot--;
            }
        }
        return max;
    }
}