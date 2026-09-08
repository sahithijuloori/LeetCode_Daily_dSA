class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for (char x : c) {
            if (x == '(' || x == '{' || x == '[') {
                st.push(x);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char t = st.peek();
                if ((x == ')') && (t == '(') || (x == '}') && (t == '{') || (x == ']') && (t == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}