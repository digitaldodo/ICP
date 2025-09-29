class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int left=1;
      int right=Arrays.stream(piles).max().getAsInt();
      int ans=right;
      while(left<=right){
        int mid=left+(right-left)/2;
        if(can(piles,h,mid)){
            ans=mid;
            right=mid-1;
        }
        else{
            left=mid+1;
        }
      } 
      return ans; 
    }
    public boolean can(int []piles,int h,int k){
        long hours=0;
        for(int i:piles){
            hours+=i/k;
            if(i % k !=0) hours++;
        }
        return hours<=h;
    }
}