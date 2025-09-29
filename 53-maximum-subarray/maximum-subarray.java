class Solution {
    public int maxSubArray(int[] nums) {
        int ress=0,rese=0;
        int curr=0;
        int maxe=nums[0],maxs=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxe+nums[i]<nums[i]){
                maxe=nums[i];
                curr=i;
            }
            else{
                maxe+=nums[i];
            }
            if(maxe>maxs){
                maxs=maxe;
                ress=curr;
                rese=i;
            }
        }
    return maxs;
    }
}