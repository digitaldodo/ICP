class Solution {
    public int trap(int[] height) {
    int l=0,r=height.length-1;
    int ans=0,left=-1,right=-1;
    while(l<r){
        left=Math.max(left,height[l]);
        right=Math.max(right,height[r]);

        if(left<right){
            ans+=(left-height[l]);
            l++;
        }
        else{
            ans+=(right-height[r]);
            r--;
        }
    }
    return ans;
    }
}