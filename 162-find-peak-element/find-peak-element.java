class Solution {
    public int findPeakElement(int[] nums) {
      for(int i=0;i<nums.length;i++){
        boolean left=true,right=true;
        if(i>0 && nums[i-1]>=nums[i]){
            left = false;
        }
        if(i<nums.length-1 && nums[i]<=nums[i+1]){
            right=false;
        }
        if(left && right){
            return i;
        }
      }  
      return 0;
    }
}