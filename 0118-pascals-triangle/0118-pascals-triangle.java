class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l.add(l1);
        if(numRows==1){
            return l;
        }
        else{
            int x=numRows-2;
            List<Integer> l2=new ArrayList<>();
            l2.add(1);
            l2.add(1);
            l.add(l2);
            while(x!=0){
                List<Integer> l3=new ArrayList<>();
                l3.add(1);
                for(int i=1;i<l2.size();i++){
                    l3.add(l2.get(i-1)+l2.get(i));
                }
                l3.add(1);
                l.add(l3);
                l2=l3;
                x--;
            }
        }
        return l;
    }
}