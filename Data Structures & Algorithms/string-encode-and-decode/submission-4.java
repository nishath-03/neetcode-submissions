class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('*').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            int y = i;
            int count = 0;
            while (str.charAt(y) != '*') {
                count = count * 10 + (str.charAt(y) - '0');
                y++;
            }
           
            int k = y+1;
            StringBuilder sb = new StringBuilder();
            for(int j=k;j<k+count;j++){
                sb.append(str.charAt(j));
            }
            ls.add(sb.toString());
             i=y+count;
        }return ls;
    }
}
