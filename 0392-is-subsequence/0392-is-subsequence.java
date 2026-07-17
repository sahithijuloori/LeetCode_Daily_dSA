class Solution {
    public boolean isSubsequence(String s, String t) {
        int x=s.length();
        int y=t.length();
        return m1(s,t);
    }
    public static boolean m1(String x, String y){
        int i=0;
        int j=0;
        int sum=0;
        while(i<x.length()&&j<y.length()){
            char a=x.charAt(i);
            char b=y.charAt(j);
            if(a==b){
                i++;
                j++;
                sum++;
            }
            if(a!=b){
                j++;
            }
        }
         if(i==x.length()){
                return true;
            }
            else{
                return false;
            }

    }
}