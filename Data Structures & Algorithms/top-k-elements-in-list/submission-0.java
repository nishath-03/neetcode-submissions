class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int arr[] = new int[k];
        List<Integer> ls = new ArrayList();
        for(int i:map.keySet()){
            ls.add(i);
        }
        ls.sort((a,b)->map.get(b)-map.get(a));
        for(int i=0;i<k;i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
}
