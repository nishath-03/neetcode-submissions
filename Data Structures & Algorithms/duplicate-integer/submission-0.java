class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int num:nums){
        //     System.out.println((num[i-1]==num[i])? "true":"false")
        // }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if((nums[i]==nums[j])){
                return true;
               }
            }

        }return false;
 
    }
}
