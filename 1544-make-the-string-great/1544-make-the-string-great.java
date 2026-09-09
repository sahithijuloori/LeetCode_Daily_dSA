class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char d=s.charAt(i);
            if(!st.isEmpty()){
                char c=st.peek();
                if(Math.abs(c-d)==32){
                    st.pop();
                }
                else{
                    st.push(d);
                }
            }
            else{
                    st.push(d);
                }
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}