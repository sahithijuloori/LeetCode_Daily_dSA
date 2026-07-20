class Solution {
    public int findComplement(int num) {
        int x=0;
        int z=num;
        while(z!=0){
            x++;
            z=z>>1;
        }
        int y=(1<<x)-1;
        return num^y;
    }
}