class Solution {
    public int maxProduct(int n) {
        List<Integer> l=new ArrayList<>();
        while(n>0){
            int d=n%10;
            l.add(d);
            n=n/10;
        }
        int max1=0;
        for(int i=0;i<l.size();i++){
            if(max1<l.get(i)){
                max1=l.get(i);
            }
        }
        l.remove(Integer.valueOf(max1));
        int max2=0;
        for(int i=0;i<l.size();i++){
            if(max2<l.get(i)){
                max2=l.get(i);
            }
        }
        return max1*max2;
    }
}