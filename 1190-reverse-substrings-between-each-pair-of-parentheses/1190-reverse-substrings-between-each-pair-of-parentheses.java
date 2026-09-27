class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==')'){
                StringBuilder sb2=new StringBuilder();
                while(st.peek()!='('){
                    sb2.append(st.pop());
                }
                st.pop();
                for(int j=0;j<sb2.length();j++){
                    st.push(sb2.charAt(j));
                }
            }
            else{
                 st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}