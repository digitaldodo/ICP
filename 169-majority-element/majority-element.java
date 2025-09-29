class Solution {
    public int majorityElement(int[] nums) {
     int count=0,can=0;
     for(int i:nums){
        if(count == 0){
            can=i;
        }
        
        if(i==can){
            count++;
        }
        else{
            count--;
        }
        
     }
 
     
     return can;   
    }
}