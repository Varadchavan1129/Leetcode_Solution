class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        
        for(int i=0;i<s.length;i++){
            int tot = 0;
            for(char c : s[i].toCharArray()){
                if(c==' ') tot++;
            }
            max = Math.max(max,tot+1);
        }
        return max;
    }
}