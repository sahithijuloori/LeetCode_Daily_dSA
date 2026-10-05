class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(0);
            }
            else if(ch==')'){
                int x=st.pop();
                int y;
                if(x>0){
                    y=2*x;
                    while(st.peek()!=0){
                        y+=st.pop();
                    }
                    st.pop();
                    while(!st.isEmpty() && st.peek()!=0){
                        y+=st.pop();
                    }
                    st.push(y);
                }
                else{
                    y=1;
                    while(!st.isEmpty() && st.peek()!=0){
                        y+=st.pop();
                    }
                    st.push(y);
                }
            }
        }
        return st.pop();
    }
}