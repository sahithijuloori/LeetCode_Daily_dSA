class Solution {
    public boolean checkValidString(String s) {
        int x = 0;
        int y = 0;
        int z = 0;
        Stack<Integer> op = new Stack<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                op.push(i);
            } else if (c == '*') {
                st.push(i);
            } else if (c == ')') {
                if (!op.isEmpty()) {
                    op.pop();
                } else if (!st.isEmpty()) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        while (!op.isEmpty() && !st.isEmpty()) {
            if (op.peek() < st.peek()) {
                op.pop();
                st.pop();
            } else {
                return false;
            }
        }
        return op.isEmpty();
    }
}