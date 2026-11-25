class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
       String cmp = s.replaceAll("[^0-9a-z]", "");
       int start = 0;
       int end = cmp.length()-1;
       while(start<end){
            if(cmp.charAt(start)!=cmp.charAt(end))return false;
            start++;
            end--;
       } 
       return true;
    }
}
