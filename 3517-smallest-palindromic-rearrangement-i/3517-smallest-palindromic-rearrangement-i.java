class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        if(s.length()==1){
            return s;
        }
        else{
            int x=s.length();
            x=(x/2);
            char[] c=new char[x];
            for(int i=0;i<x;i++){
                char ch=s.charAt(i);
                c[i]=ch;
            }
            Arrays.sort(c);
            for(int j=0;j<x;j++){
                sb.append(c[j]);
            }
            if((s.length())%2!=0){
                sb.append(s.charAt(x));
            }
            for(int k=x-1;k>=0;k--){
                sb.append(c[k]);
            }
        }
        return sb.toString();
    }
}