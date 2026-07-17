class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List l1=method(nums2,nums1);
        List l2=method(nums1,nums2);
        List<List<Integer>> l=new ArrayList<>();
        l.add(l1);
        l.add(l2);
        return l;
    }
    public List<Integer> method(int[] nums1,int[] nums2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(!set1.contains(nums2[j])){
                set2.add(nums2[j]);
            }
        }
        List<Integer> li=new ArrayList<>();
        for(int x:set2){
            li.add(x);
        }
        return li;
    }
}