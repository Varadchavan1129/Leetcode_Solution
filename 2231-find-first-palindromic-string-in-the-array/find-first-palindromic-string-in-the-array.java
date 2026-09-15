class Solution {
    public String firstPalindrome(String[] words) {
        int n = words.length;
        for(int x=0;x<n;x++){
            String s = words[x];
            int i=0;
            int j = s.length() - 1;
            int flag = 0;
            while(i <= j){
                if(s.charAt(i) != s.charAt(j)) {
                    flag = 1;
                    break;
                }
                i++;
                j--;
            }
        if(flag == 0) return s;
        }
        return "";
        
    }
}