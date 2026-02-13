class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charList = new int[26];
        for(int i = 0; i < s.length(); i++){
            charList[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
           int index = t.charAt(i) - 'a';
            charList[index]--;
            if (charList[index] < 0) {
                return false;
            }
            
        }

        return true;
    }
}