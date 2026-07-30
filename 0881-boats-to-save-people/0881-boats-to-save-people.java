class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int sum=0;
        while(l<=r){
            int a=people[l]+people[r];
            if(a<=limit){
                l++;
                r--;
                sum++;
            }
            else if(a>limit){
                r--;
                sum++;
            }
        }
        return sum;
    }
}