class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(m==n && (s+s).contains(goal)) return true;
        else return false;
    }
}