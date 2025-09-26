class Solution {
    public int trap(int[] height) {
    int n=height.length;
    int l=0,r=n-1,ans=0,left=-1,right=-1;
    while(l<r){
        left=Math.max(height[l],left);
        right=Math.max(height[r],right);
        if(left<right){
            ans+=left-height[l];
            l++;
        }
        else{
            ans+=right-height[r];
            r--;
        }
    }
    return ans;
    }
}