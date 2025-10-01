class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int max=0;
        if(s.length==0) return max;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=s.length-1;
        int j=g.length-1;
        while(i>=0 && j>=0){
            if(s[i]>=g[j]){
                max++;
                i--;
                j--;
            }
            else{
                j--;
            }
        }
    return max;
    }
}