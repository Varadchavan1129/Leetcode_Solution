import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void genrate(int n, int l,int r,String s,List<String>ans){
        if(r==n) {
            ans.add(s);
            return;
        }
        if(l<n) genrate(n,l+1,r,s+"(",ans);
        if(r<l) genrate(n,l,r+1,s+")",ans);
    }

    public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList<>();
            genrate(n,0,0,"",ans);
            return ans;
        
    }
} 
    

