class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap();

        for(String s : strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String head = new String(c);
            if(map.containsKey(head)){
                map.get(head).add(s);
            }else{
                 List<String> temp = new ArrayList<>();
                 temp.add(s);
                 map.put(head, temp);
            }
        }
        for(List<String> ls : map.values()){
            res.add(ls);
        }
        return res;
    }
}
