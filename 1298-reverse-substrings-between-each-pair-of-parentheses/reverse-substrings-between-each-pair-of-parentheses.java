class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> st = new Stack<>();

        for(char ch : s.toCharArray()){
                if(ch=='('){
                    st.push(sb);
                    sb = new StringBuilder();
                }
                else if(ch==')'){
                    sb.reverse();
                    StringBuilder rev= st.pop();
                    rev.append(sb);
                    sb = rev;
                }
                else{
                    sb.append(ch);
                }
        }
        return sb.toString();
    }
}