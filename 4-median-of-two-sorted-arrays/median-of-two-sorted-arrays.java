class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m=nums1.length,n=nums2.length;
        int l=0,r=m;
        while(l<=r){
            int P1=l+(r-l)/2;
            int P2=(m+n+1)/2 -P1;
            int x1= (P1==0) ? Integer.MIN_VALUE : nums1[P1-1];
            int x2= (P2==0) ? Integer.MIN_VALUE : nums2[P2-1];
            int x3= (P1==m) ? Integer.MAX_VALUE : nums1[P1];
            int x4= (P2==n) ? Integer.MAX_VALUE : nums2[P2];

            if(x1<=x4 && x2<=x3){
                if((m+n)%2==1){
                    return Math.max(x1,x2);
                }
                return (Math.max(x1,x2)+Math.min(x3,x4))/2.0;
            }
            else if (x1>x4){
                r=P1-1;
            }
            else if (x2>x3){
                l=P1+1;
            }
        }
        return -1;
    }
}