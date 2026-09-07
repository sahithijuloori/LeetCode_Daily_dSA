class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
       
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n=m1(n);
        }
        return true;
    }
    public static int m1(int sa){
    int sum=0;
    while(sa!=0){
        int x=sa%10;
        int y=x * x;
        sum+=y;
        sa=sa/10;
    }
    return sum;
}
}
