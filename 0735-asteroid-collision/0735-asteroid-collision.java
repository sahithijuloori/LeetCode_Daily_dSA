class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            boolean alive=true;
            int y=Math.abs(asteroids[i]);
            while(!s.isEmpty() && asteroids[i]<0 && asteroids[s.peek()]>0){
                int x=s.peek();
                int z=Math.abs(asteroids[x]);
                if(y>z){
                    s.pop();
                }
                else if(y==z){
                    s.pop();
                    alive=false;
                    break;
                }
                else{
                    alive=false;
                    break;
                }
            }
            if(alive){
                s.push(i);
            }
        }
        int[] ans=new int[s.size()];
        int k=ans.length-1;
        while(!s.isEmpty()){
            ans[k]=asteroids[s.pop()];
            k--;
        }
        return ans;
    }
}