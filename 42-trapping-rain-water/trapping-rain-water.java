class Solution {
    public int trap(int[] height) {
        int []rmax=new int[height.length];
        int []lmax=new int[height.length];
        int ramax=-1,lamax=-1;
        for(int i=0;i<height.length;i++){
            if(height[i]>=ramax){
                ramax=height[i];
                
            }
            rmax[i]=ramax;
        }
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>=lamax){
                lamax=height[i];
                
            }
            lmax[i]=lamax;
        }
        int res=0;
        for(int i=0;i<height.length;i++){
            res+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return res;
    }
}