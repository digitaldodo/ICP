class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashSet<Character>d=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(d.contains(s.charAt(right))){
                d.remove(s.charAt(left));
                left++;
            }
            d.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}