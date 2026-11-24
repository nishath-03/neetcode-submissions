class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0; // Pointer for s (the source)
        int j = 0; // Pointer for t (the target prefix)

        // We use 'i' to traverse through 's' looking for 't[j]'
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                // We found a match for the current character of t!
                // Now we move to look for the NEXT character of t.
                j++;
            }
            // We always move to the next character in s to keep searching
            i++;
        }

        // 'j' is now the count of characters from the start of t 
        // that were found in s. The rest need to be appended.
        return t.length() - j;
    }
}