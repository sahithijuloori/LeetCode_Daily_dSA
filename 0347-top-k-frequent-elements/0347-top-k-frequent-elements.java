class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       /*int count=0;
       int i=0;
       int j=i+1;
       Arrays.sort(nums);
       while(j<nums.length){
        int x=nums[i];
        int y=nums[j];
        if(x==y){
            j++;
        }
        else{
            int a=j-i;
            map.put(nums[i],a);
            if(a>=k){
                count++;
            }
            i=j;
            j++;
        }
       } 
       int arr[]=new int[count];
       int c=0;
       for(Integer s:map.keySet()){
        int b=map.get(s);
        if(b>=k){
            arr[c]=b;
            c++;
        }
       }
       return arr;*/
       int[] arr=new int[k];
       for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
       }
       List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
       l.sort((a,b) -> b.getValue().compareTo(a.getValue()));
       for(int i=0;i<k;i++){
        arr[i]=l.get(i).getKey();
       }
       return arr;
    }
}