class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            String s = words[i];
            for(char ch : s.toCharArray()){
                if(ch==x){
                     ans.add(i);
                     break;
                }
            }
        }
        return ans;
    }
}