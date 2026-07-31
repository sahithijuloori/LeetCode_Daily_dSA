class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] c=word.toCharArray();
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum=0;
        List<Map.Entry<Character,Integer>> l=new ArrayList<>(map.entrySet());
        l.sort((a,b) ->Integer.compare(b.getValue(),a.getValue()));
        for(int j=0;j<l.size();j++){
            int x=l.get(j).getValue();
            if(j<8){
                sum+=x;
            }
            else if(j>=8 && j<16){
                sum+=(2*x);
            }
            else if(j>=16 && j<24){
                sum+=(3*x);
            }
            else{
                sum+=(4*x);
            }
        }
        return sum;
    }
}