class Solution {
    public int minAddToMakeValid(String s) {
        int x=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push('(');
            }
            else{
                if(st.isEmpty()){
                    x+=1;
                }
                else{
                    st.pop();
                }
            }
        }
        x+=st.size();
            return x;
        
    }
}