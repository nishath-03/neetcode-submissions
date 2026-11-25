class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i-1)){
                map.put(i, map.get(i-1)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        int max=0;
        for(int i:map.values()){
            max = Math.max(i, max);
        }
        //System.out.print(map);
        return max;
    }
}
