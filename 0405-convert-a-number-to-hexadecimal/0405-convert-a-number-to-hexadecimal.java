class Solution {
    public String toHex(int num) {
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb=new StringBuilder();
        int x=num;
        if(x==0){
            return Integer.toString(x);
        }
        while(x!=0){
            int c=(x&15);
            x=(x>>>4);
            sb.append(hex[c]);
        }
        return sb.reverse().toString();
    }
}