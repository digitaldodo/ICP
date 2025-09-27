class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int n=nums1.length,m=nums2.length;
        int l=0,r=nums1.length;
        while(l<=r){
            int Px=l+(r-l)/2;
            int Py=(m+n+1)/2-Px;
            int x1 = (Px==0) ? Integer.MIN_VALUE : nums1[Px-1];
            int x2 = (Py==0) ? Integer.MIN_VALUE : nums2[Py-1];
            int x3 = (Px==n) ? Integer.MAX_VALUE : nums1[Px];
            int x4 = (Py==m) ? Integer.MAX_VALUE : nums2[Py];
            if(x1<=x4 && x2<=x3){
                if((m+n)%2==1){
                    return Math.max(x1,x2);
                }
            
            return (Math.max(x1,x2)+Math.min(x3,x4))/2.0;
            }
            else if (x1>x4){
                r=Px-1;
            }
            else if (x2>x3){
                l=Px+1;
            }
        }
        return -1;
    }
}