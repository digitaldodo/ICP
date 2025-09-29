class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmin=nums[0],min=nums[0],currmax=nums[0],max=nums[0];
        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            total+=nums[i];
            currmax=Math.max(nums[i],nums[i]+currmax);
            max=Math.max(currmax,max);
            currmin=Math.min(nums[i],nums[i]+currmin);
            min=Math.min(min,currmin);
        }
        if(max < 0) return max;
        return Math.max(max,total-min);
    }
}