class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>basket=new HashMap<>();
        int left=0,right=0,max=0;
        for(right=0;right<fruits.length;right++){
            basket.put(fruits[right],basket.getOrDefault(fruits[right],0)+1);
            while(basket.size()>2){
                int fcount=basket.get(fruits[left]);
                if(fcount==1) basket.remove(fruits[left]);
                else basket.put(fruits[left],fcount-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}