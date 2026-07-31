class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int sum=0;
        char[] c=s.toCharArray();
        for(int i=0;i<k;i++){
            char ch=c[i];
            if(set.contains(ch)){
                sum++;
            }
        }
        int j=0;
        int z=k;
        int max=sum;
        while(z<c.length){
            char d=c[j];
            char e=c[z];
            if(set.contains(d)){
                sum--;
            }
            if(set.contains(e)){
                sum++;
            }
            j++;
            z++;
            max=Math.max(sum,max);
        }
        return max;
    }
}